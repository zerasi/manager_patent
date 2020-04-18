package com.sys.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sys.entity.SysUser;
import lombok.Data;

import java.util.Date;

@Data
public class InventSug {

    private Integer id;
    private String invent_sug;
    private String status_cd;
    private Integer invent_id;
    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss",timezone="GMT+8")
    private Date create_date;
    private Integer user_id;
    private String bak1;
    private String bak2;
    private String bak3;
    private SysUser user;

}
