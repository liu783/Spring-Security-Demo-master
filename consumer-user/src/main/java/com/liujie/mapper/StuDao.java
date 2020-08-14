package com.liujie.mapper;


import com.liujie.entity.User;
import com.liujie.mapper.impl.StuImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

// 获取SPRINGCLOUD-PORDUCT服务下得
@FeignClient(value = "zuul-server",fallback = StuImpl.class)
@Component
public interface StuDao {

	@RequestMapping (value = "/porder/order/listAll")
	String listAllOrder ();

	@RequestMapping (value = "/pstu/user/listAll",method = RequestMethod.GET)
	List<User> listAll ();

	@RequestMapping (value = "/pstu/user/add",method = RequestMethod.POST)
	String add (@RequestBody User user);


	@RequestMapping (value = "/user/del",method = RequestMethod.POST)
	String del (@RequestParam("userid") Integer userid);


	@RequestMapping (value = "/user/update",method = RequestMethod.POST)
	String update (@RequestBody User user);


}
