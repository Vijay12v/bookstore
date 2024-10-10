package com.example.bookstore.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String isbn;

    @ManyToOne
    private Author author;

    // // Getters and Setters
    // public Long getId() {
    //     return id;
    // }

    // public void setId(Long id) {
    //     this.id = id;
    // }

    // public String getTitle() {
    //     return title;
    // }

    // public void setTitle(String title) {
    //     this.title = title;
    // }

    // public String getIsbn() {
    //     return isbn;
    // }

    // public void setIsbn(String isbn) {
    //     this.isbn = isbn;
    // }

    // public Author getAuthor() {
    //     return author;
    // }

    // public void setAuthor(Author author) {
    //     this.author = author;
    // }
}
