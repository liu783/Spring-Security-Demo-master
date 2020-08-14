package com.liujie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("porder/order")
public class OrderController {


	@RequestMapping( value = "/listAll")
	@ResponseBody
	public String listAll () {
		System.out.println("order listAll");
		return "orderList";
	}



}
