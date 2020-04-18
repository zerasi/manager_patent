package com.sys.config;

import com.sys.utils.ResponseCode;
import com.sys.utils.Results;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Results handle(Exception e) {
        log.info("进入error");

        if(e instanceof AccessDeniedException){
            log.error("权限异常 {}", e);
            return Results.failure(ResponseCode.NO_PERMISSION_CODE);
        }else if(e instanceof LockedException){
            return Results.failure(500,"账号被锁定");
        }else if(e instanceof DisabledException){
            return Results.failure(500,"账号不可用");
        }else if(e instanceof AuthenticationCredentialsNotFoundException){
            return Results.failure(500,"账号不存在");
        }
        log.error("系统异常 {}", e);

        return Results.failure();
    }
}