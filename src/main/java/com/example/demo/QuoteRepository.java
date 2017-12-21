package com.example.demo;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface QuoteRepository extends JpaRepository<Quote, Serializable> {

	Page<Quote> findByQuote(@Param("quote") String quote, Pageable page);
	Page<Quote> findByAuthor(@Param("author") String author, Pageable page); 
	Page<Quote> findByQuoteAndAuthor(@Param("quote") String quote, @Param("author") String author, Pageable page); 
}
