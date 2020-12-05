package com.javatodev.api.repository;

import com.javatodev.api.model.Book;
import com.javatodev.api.model.Lend;
import com.javatodev.api.model.LendStatus;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LendRepository extends JpaRepository<Lend, Long> {
    Optional<Lend> findByBookAndStatus(Book book, LendStatus status);
}
