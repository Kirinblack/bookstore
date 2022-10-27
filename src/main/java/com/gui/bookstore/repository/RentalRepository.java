package com.gui.bookstore.repository;

<<<<<<< HEAD
import com.gui.bookstore.model.RentalModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RentalRepository extends JpaRepository<RentalModel,Long> {
=======
import com.gui.bookstore.model.BookModel;
import com.gui.bookstore.model.RentalModel;
import com.gui.bookstore.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentalRepository extends JpaRepository<RentalModel,Long> {

    List<RentalModel> findByBook(BookModel bookModel);

    List<RentalModel> findByUsers(UserModel userModel);
>>>>>>> 3a98c288d77b73e7164d3b3d89d3d94b8c813086
}
