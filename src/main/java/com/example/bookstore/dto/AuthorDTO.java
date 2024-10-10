package com.example.bookstore.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Data


public class AuthorDTO {
    private Long id;
    private String name;

    @JsonIgnore
   private String password; 

    // Getters and Setters
//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }
}
