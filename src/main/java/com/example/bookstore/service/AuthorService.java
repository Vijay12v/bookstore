package com.example.bookstore.service;
import com.example.bookstore.dto.*;
import com.example.bookstore.entity.*;
import com.example.bookstore.mapper.*;
// import com.example.bookstore.mapper.BookstoreMapper;
import com.example.bookstore.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookstoreMapper bookstoreMapper;

    public List<AuthorDTO> findAll() {
        return authorRepository.findAll().stream()
                .map(bookstoreMapper::authorToAuthorDTO)
                .collect(Collectors.toList());
    }

    public Optional<AuthorDTO> findById(Long id) {
        return authorRepository.findById(id)
                .map(bookstoreMapper::authorToAuthorDTO);
    }

    // public AuthorDTO save(AuthorDTO authorDTO) {
    //     Author author = bookstoreMapper.authorDTOToAuthor(authorDTO);
    //     Author savedAuthor = authorRepository.save(author);
    //     return bookstoreMapper.authorToAuthorDTO(savedAuthor);
    // }
    public AuthorDTO save(Author author) {
        // AuthorDTO author = bookstoreMapper.authorToAuthorDTO(saveAuthor);
        Author savedAuthor = authorRepository.save(author);
        return bookstoreMapper.authorToAuthorDTO(savedAuthor);
        //return authorRepository.save(author);
    }


    public void deleteById(Long id) {
        authorRepository.deleteById(id);
    }
}
