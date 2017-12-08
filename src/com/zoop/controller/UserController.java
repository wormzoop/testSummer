package com.zoop.controller;

import java.util.List;
import java.util.Map;

import com.zoop.annotation.Autowired;
import com.zoop.annotation.Controller;
import com.zoop.annotation.RequestMapping;
import com.zoop.service.impl.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping(value="/list")
	public List<Map<String, Object>> exe() {
		return userService.list();
	}
	
}
