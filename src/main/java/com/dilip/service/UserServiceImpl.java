package com.dilip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dilip.repository.UserServiceRepository;
import com.dilip.shoping.beans.Status;
import com.dilip.shoping.beans.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserServiceRepository playerRepository;

	@Override
	public Status signUp(User user) {
		// TODO Auto-generated method stub
		System.out.println(playerRepository);
		return null;
	}

	@Override
	public Status logIn(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Status logOut(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}