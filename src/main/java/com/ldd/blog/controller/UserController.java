package com.ldd.blog.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ldd.blog.dao.IUserDAO;

@Controller
@RequestMapping("/user")
public class UserController
{
	@Autowired
	private IUserDAO iUserDAO;

	@RequestMapping("/getUser")
	public String getUser()
	{
		Map<String, Object> map = iUserDAO.getUser("907948467@qq.com");
		System.out.println(map);
		return "index";
	}

	public void setiUserDAO(IUserDAO iUserDAO)
	{
		this.iUserDAO = iUserDAO;

		
	}
}
