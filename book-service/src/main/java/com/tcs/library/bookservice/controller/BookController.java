package com.tcs.library.bookservice.controller;

import com.tcs.library.bookservice.model.Book;
import com.tcs.library.bookservice.model.BookStatus;
import com.tcs.library.bookservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }


    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookRepository.findById(id).get();
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/borrow/")
    public boolean borrowBook(@RequestParam Long bookId){
        Book book = bookRepository.findById(bookId).get();
        if(Objects.nonNull(book) && Objects.nonNull(book.getStatus())){
            BookStatus status = book.getStatus();
            if(status.equals(BookStatus.AVAILABLE))
                book.setStatus(BookStatus.BORROWED);
        }
        return true;
    }
}
