package com.gui.bookstore.repository;

import com.gui.bookstore.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<BookModel,Long> {

    Optional<BookModel> findById(Long id);

    Optional<BookModel>findByName(String name);

<<<<<<< HEAD
    Optional<BookModel> findByPublisherId(Long id);
=======
>>>>>>> 3a98c288d77b73e7164d3b3d89d3d94b8c813086

}
