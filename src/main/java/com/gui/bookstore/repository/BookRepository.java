package com.gui.bookstore.repository;

import com.gui.bookstore.model.BookModel;
import com.gui.bookstore.model.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<BookModel,Long> {

    Optional<BookModel> findById(Long id);

    Optional<BookModel>findByName(String name);

    Optional<BookModel>findByPublisher(PublisherModel publisherModel);

}
