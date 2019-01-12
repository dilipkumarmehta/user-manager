package com.dilip.shoping.service;

import com.dilip.shoping.beans.Status;
import com.dilip.shoping.beans.User;

public interface UserService {
	public Status signUp(User user);

	public Status logIn(User user);

	public Status logOut(String userId);

}