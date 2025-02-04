package com.webServices.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webServices.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
