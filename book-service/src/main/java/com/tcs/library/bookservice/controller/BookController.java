package com.tcs.library.bookservice.controller;

import com.tcs.library.bookservice.model.Book;
import com.tcs.library.bookservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> getAllAuthors() {
        return bookRepository.findAll();
    }

    @PostMapping
    public Book createAuthor(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }


    @GetMapping("/{id}")
    public Book getAuthor(@PathVariable Long id) {
        return bookRepository.findById(id).get();
    }

    @PutMapping("/{id}")
    public Book updateAuthor(@PathVariable Long id, @RequestBody Book book) {
        return bookRepository.save(book);
    }
}
