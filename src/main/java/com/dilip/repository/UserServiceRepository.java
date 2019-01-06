package com.dilip.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dilip.shoping.beans.User;

@Repository
public interface UserServiceRepository extends CrudRepository<User, String> {

	List<User> findByTeamId(String username);
}