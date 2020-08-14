package com.liujie.controller;

import com.liujie.entity.User;
import com.liujie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("pstu/user")
@CrossOrigin
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping ( value = "/listAll", method = RequestMethod.GET  )
	@ResponseBody
	public List<User> listAll () {
		System.out.println("stu2 8084");
		return userService.selectAll();
	}

	@RequestMapping ( value = "/add",method = RequestMethod.POST)
	@ResponseBody
	public String add (@RequestBody User user) {
		int i = userService.addUser(user);
		return i > 0 ? "1":"0";
	}

	@RequestMapping ( value = "/del", method = RequestMethod.POST )
	@ResponseBody
	public String del (Integer userid) {
		int i = userService.del(userid);
		return i > 0 ? "1":"0";
	}


	@RequestMapping ( value = "/update", method = RequestMethod.POST )
	@ResponseBody
	public String update (@RequestBody User user) {
		int i = userService.update(user);
		System.out.println("i2 : "+i);
		return i > 0 ? "1":"0";
	}




}
