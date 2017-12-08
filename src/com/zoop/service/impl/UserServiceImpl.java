package com.zoop.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zoop.annotation.Service;
import com.zoop.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public List<Map<String, Object>> list() {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", "jijkj");
		map.put("name", "jijij9090");
		list.add(map);
		return list;
	}

}
