package com.tcs.library.bookservice.repository;

import com.tcs.library.bookservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
