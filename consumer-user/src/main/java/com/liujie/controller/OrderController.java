package com.liujie.controller;


import com.liujie.mapper.StuDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("order")
public class OrderController {

	@Resource
	private StuDao stuDao;


	@RequestMapping ( value = "/listAll")
	@ResponseBody
	public String listAll () {
		return stuDao.listAllOrder();
	}


}
