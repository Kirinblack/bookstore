package com.gui.bookstore.repository;

import com.gui.bookstore.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<BookModel,Long> {

    Optional<BookModel> findById(Long id);

    Optional<BookModel>findByName(String name);

    Optional<BookModel> findByPublisherId(Long id);

}
