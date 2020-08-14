package com.liujie.mapper.impl;

import com.liujie.entity.User;
import com.liujie.mapper.StuDao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StuImpl implements StuDao {


	@Override
	public String listAllOrder() {
		return "无订单信息";
	}

	public List<User> listAll() {
		return null;
	}

	public String add(User user) {
		return "2";
	}

	public String del(Integer userid) {
		return "2";
	}

	public String update(User user) {
		return "2";
	}
}
