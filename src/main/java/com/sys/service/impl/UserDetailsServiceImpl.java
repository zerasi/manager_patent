package com.sys.service.impl;


import com.sys.config.security.LoginAttemptService;
import com.sys.dao.PermissionDao;
import com.sys.entity.LoginUser;
import com.sys.entity.SysPermission;
import com.sys.entity.SysUser;
import com.sys.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * spring security登陆处理<br>
 */

@Slf4j
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserService userService;
	@Autowired
	private PermissionDao permissionDao;

	@Autowired
	private LoginAttemptService loginAttemptService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		SysUser sysUser = userService.getUser(username);
		if (sysUser == null) {
			throw new AuthenticationCredentialsNotFoundException("用户名不存在");
		} else if (sysUser.getStatus() == SysUser.Status.LOCKED) {
			throw new LockedException("用户被锁定,请联系管理员");
		} else if (sysUser.getStatus() == SysUser.Status.DISABLED) {
			throw new DisabledException("用户已作废,请联系管理员");
		}

		if (loginAttemptService.isBlocked(username)) {
			//锁定用户
			List<Long> list = new ArrayList<>();
			list.add(sysUser.getId().longValue());
			userService.lockUser(list,SysUser.Status.LOCKED);
			log.info("用户已被锁定："+username);
			throw new RuntimeException("用户被锁定,请联系管理员");
		}
		/*log.info("剩余次数："+username+"-"+loginAttemptService.getAttemptFailNum(username));
		if(!loginAttemptService.getAttemptFailNum(username).equals(0)){
			throw new RuntimeException("密码输入错误，剩余次数："+loginAttemptService.getAttemptFailNum(username));
		}*/

		LoginUser loginUser = new LoginUser();
		BeanUtils.copyProperties(sysUser, loginUser);

		List<SysPermission> permissions = permissionDao.listByUserId(sysUser.getId());
		loginUser.setPermissions(permissions);

		return loginUser;
	}

}
