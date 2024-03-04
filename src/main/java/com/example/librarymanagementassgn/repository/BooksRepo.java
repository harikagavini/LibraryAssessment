package com.example.librarymanagementassgn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.librarymanagementassgn.entity.BookEntity;


public interface BooksRepo extends JpaRepository<BookEntity, Long> {

}
