package com.dilip.shoping.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dilip.shoping.beans.User;


@SuppressWarnings("rawtypes")
@Repository
public interface UserServiceRepository extends CrudRepository{

	List<User> findAllUser();
}