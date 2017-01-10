package com.ldd.blog.dao;

import java.util.Map;

public interface IUserDAO
{
	public Map<String, Object> getUser(String email);
}
