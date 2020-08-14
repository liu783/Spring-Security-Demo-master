package com.liujie.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liujie.entity.User;
import com.liujie.mapper.StuDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("user")
@CrossOrigin
public class StuController {

	@Resource
	private StuDao stuDao;


	@RequestMapping ( value = "/listAll")
	@ResponseBody
	public Object listAll (Model model, @RequestParam(required = true,defaultValue = "1") Integer page) {
		PageHelper.startPage(page,1);
		List<User> users = stuDao.listAll();
		PageInfo<User> pageList = new PageInfo<User>(users);
		return pageList;
	}


	@RequestMapping ( value = "/add")
	@ResponseBody
	public Object add (@RequestBody User user) {
		return stuDao.add(user);
	}

	@RequestMapping ( value = "/del")
	@ResponseBody
	public Object del (Integer userid) {
		return stuDao.del(userid);
	}


	@RequestMapping ( value = "/update")
	@ResponseBody
	public Object update (@RequestBody User user) {
		return stuDao.update(user);
	}



}
