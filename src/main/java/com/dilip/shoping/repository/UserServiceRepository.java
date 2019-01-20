package com.dilip.shoping.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dilip.shoping.beans.User;

@Repository
public interface UserServiceRepository extends JpaRepository<User, Long> {

	@Query(value = "select * from userinfo where MOBILE_NMBER=:mobilenumber and password=:password", nativeQuery = true)
	public Optional<User> logIn(@Param("mobilenumber") long mobilenumber, @Param("password") String password);
	
	//public Optinal<User> updatePassword();

	public Optional<User> findBymobileNmber(long mobilenumber);
	
	public Optional<User> findBypassword(String mobilenumber);
	
	

}