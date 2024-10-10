package com.example.bookstore.mapper;
import com.example.bookstore.dto.*;
import com.example.bookstore.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface BookstoreMapper {

    // Maps Book to BookDTO, ignoring the author's password
    @Mapping(target = "author.password", ignore = true)
    BookDTO bookToBookDTO(Book book);

    // Maps BookDTO to Book, ignoring the author's password
    @Mapping(source = "author", target = "author")
    @Mapping(target = "author.password", ignore = true)
    Book bookDTOToBook(BookDTO bookDTO);

    // Maps Author to AuthorDTO, ignoring the password
    @Mapping(target = "password", ignore = true) // Ignore password in AuthorDTO
    AuthorDTO authorToAuthorDTO(Author author);

    // Maps AuthorDTO to Author, including all fields (except password)
    Author authorDTOToAuthor(AuthorDTO authorDTO);
}
