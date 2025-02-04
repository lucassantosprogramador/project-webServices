package com.webServices.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webServices.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
