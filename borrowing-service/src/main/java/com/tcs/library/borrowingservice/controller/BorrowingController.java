package com.tcs.library.borrowingservice.controller;

import com.tcs.library.borrowingservice.model.BorrowingRecord;
import com.tcs.library.borrowingservice.repository.BorrowingServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrowing")
public class BorrowingController {
    @Autowired
    private BorrowingServiceRepository borrowingRepository;

    @GetMapping
    public List<BorrowingRecord> getAllAuthors() {
        return borrowingRepository.findAll();
    }

    @PostMapping
    public BorrowingRecord createAuthor(@RequestBody BorrowingRecord book) {
        return borrowingRepository.save(book);
    }
}