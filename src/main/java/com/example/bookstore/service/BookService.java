package com.example.bookstore.service;
import com.example.bookstore.repository.*;
import com.example.bookstore.mapper.BookstoreMapper;
import com.example.bookstore.dto.*;
import com.example.bookstore.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private BookstoreMapper bookstoreMapper;

    public List<BookDTO> findAll() {
        return bookRepository.findAll().stream()
                .map(bookstoreMapper::bookToBookDTO)
                .collect(Collectors.toList());
    }

    public Optional<BookDTO> findById(Long id) {
        return bookRepository.findById(id)
                .map(bookstoreMapper::bookToBookDTO);
    }

    public BookDTO save(BookDTO bookDTO) {
        Book book = bookstoreMapper.bookDTOToBook(bookDTO);
        Book savedBook = bookRepository.save(book);
        return bookstoreMapper.bookToBookDTO(savedBook);
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}
