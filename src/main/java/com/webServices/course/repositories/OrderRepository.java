package com.webServices.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webServices.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
