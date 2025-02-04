package com.webServices.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webServices.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
