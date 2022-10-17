package com.gui.bookstore.repository;

import com.gui.bookstore.model.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PublisherRepository extends JpaRepository<PublisherModel,Long> {

    Optional<PublisherModel> findByName(String name);

    Optional<PublisherModel> findById(Long id);
}
