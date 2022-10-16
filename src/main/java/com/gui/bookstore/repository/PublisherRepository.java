package com.gui.bookstore.repository;

import com.gui.bookstore.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PublisherRepository extends JpaRepository<Publisher,Long> {

    Optional<Publisher> findByName(String name);

    Optional<Publisher> findById(Long id);
}
