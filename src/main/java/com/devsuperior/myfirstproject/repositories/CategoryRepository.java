package com.devsuperior.myfirstproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.myfirstproject.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
