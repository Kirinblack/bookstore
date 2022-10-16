package com.gui.bookstore.repository;

import com.gui.bookstore.model.Book;
import com.gui.bookstore.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Long> {

    Optional<Book> findById(Long id);

    Optional<Book>findByName(String name);

    Optional<Book>findByPublisher(Publisher publisher);

    Optional<Book>findByNameOrId(String name,Long id);
}
