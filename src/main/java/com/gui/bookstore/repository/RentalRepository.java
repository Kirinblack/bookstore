package com.gui.bookstore.repository;

import com.gui.bookstore.model.Book;
import com.gui.bookstore.model.Rental;
import com.gui.bookstore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentalRepository extends JpaRepository<Rental,Long> {

    List<Rental> findByBook(Book books);

    List<Rental> findByUsers(User user);
}
