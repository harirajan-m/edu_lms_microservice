package com.tcs.library.authorservice.repository;

import com.tcs.library.authorservice.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
