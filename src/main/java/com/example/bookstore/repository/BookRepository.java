package com.example.bookstore.repository;
import com.example.bookstore.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
