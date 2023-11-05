package com.tcs.library.bookservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String ISBN;
    private Long authorId; // Instead of the whole author object, we're storing authorId
    @Enumerated(EnumType.STRING)
    private BookStatus status;
}

enum BookStatus {
    AVAILABLE,
    BORROWED
}