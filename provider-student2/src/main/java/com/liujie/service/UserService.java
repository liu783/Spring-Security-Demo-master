package com.liujie.service;

import com.liujie.entity.User;
import com.liujie.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

public interface UserService {

	List<User> selectAll();

	int del(Integer userid);

	int addUser(User user);

	int loginNamePwd(String username, String userpwd);

	int update(User user);

}
