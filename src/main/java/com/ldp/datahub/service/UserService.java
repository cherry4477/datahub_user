package com.ldp.datahub.service;

import com.ldp.datahub.entity.User;
import com.ldp.datahub.vo.UserVo;

public interface UserService
{
	/**
	 * 根据用户名查询用户
	 * @param user
	 * @return
	 */
	public UserVo getUser(String userName);
	
	/**
	 * 根据用户名修改用户
	 */
	public int updateUser(User user);
	
	/**
	 * 根据用户名删除用户
	 */
	public int deleteUser(User user);
	
	/**
	 * 用户登录
	 */
	public int userLogin(User user);
}