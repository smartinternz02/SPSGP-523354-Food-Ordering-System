package com.foodDelivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodDelivery.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>  {
	
	public List<Book> findByNameContaining(String name); 
}
