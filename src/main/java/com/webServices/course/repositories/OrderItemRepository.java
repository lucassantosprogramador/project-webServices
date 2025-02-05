package com.webServices.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webServices.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
	

}
