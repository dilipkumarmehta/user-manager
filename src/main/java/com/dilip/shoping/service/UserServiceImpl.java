package com.dilip.shoping.service;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dilip.shoping.beans.Status;
import com.dilip.shoping.beans.User;
import com.dilip.shoping.repository.UserServiceRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	DataSource dataSource;

	@Autowired(required = true)
	private UserServiceRepository userServiceRepository;

	@Override
	public Status signUp(User user) {
		return null;
	}

	@Override
	public Status logIn(User user) {

		userServiceRepository.save(user);
		System.out.println("persisted");
		return null;
	}

	@Override
	public Status logOut(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}