package com.gui.bookstore.repository;

import com.gui.bookstore.model.BookModel;
import com.gui.bookstore.model.RentalModel;
import com.gui.bookstore.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentalRepository extends JpaRepository<RentalModel,Long> {

    List<RentalModel> findByBook(BookModel bookModel);

    List<RentalModel> findByUsers(UserModel userModel);
}
