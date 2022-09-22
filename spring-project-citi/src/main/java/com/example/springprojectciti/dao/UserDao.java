package com.example.springprojectciti.dao;

import com.example.springprojectciti.controller.bean.User;

public interface UserDao {
	User getUserById(String userId);
}
