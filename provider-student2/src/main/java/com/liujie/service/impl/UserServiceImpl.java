package com.liujie.service.impl;

import com.liujie.entity.User;
import com.liujie.mapper.UserMapper;
import com.liujie.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public List<User> selectAll() {
		return userMapper.selectAllUser();
	}

	@Override
	public int del(Integer userid) {
		System.out.println("service del userid : "+userid);
		return userMapper.del(userid);
	}

	@Override
	public int addUser(User user) {
		System.out.println("service add user : "+user);
		return userMapper.addUser(user);
	}

	@Override
	public int loginNamePwd(String username, String userpwd) {
		return userMapper.loginNamePwd(username, userpwd);
	}

	@Override
	public int update(User user) {
		System.out.println("service update user : "+user);
		return userMapper.update(user);
	}




}
