package com.wonoh.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wonoh.spring.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao initdao;
	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

}
