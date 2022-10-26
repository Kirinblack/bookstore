package com.gui.bookstore.repository;

import com.gui.bookstore.model.RentalModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RentalRepository extends JpaRepository<RentalModel,Long> {
}
