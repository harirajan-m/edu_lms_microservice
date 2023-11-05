package com.tcs.library.borrowingservice.repository;

import com.tcs.library.borrowingservice.model.BorrowingRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowingServiceRepository extends JpaRepository<BorrowingRecord, Long> {
}
