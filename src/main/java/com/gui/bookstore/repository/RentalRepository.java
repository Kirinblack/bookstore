package com.gui.bookstore.repository;

import com.gui.bookstore.model.BookModel;
import com.gui.bookstore.model.RentalModel;
import com.gui.bookstore.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentalRepository extends JpaRepository<RentalModel,Long> {

    List<RentalModel> findByBook(BookModel books);

    List<RentalModel> findByUser(UserModel user);

}
