package com.gui.bookstore.repository;

import com.gui.bookstore.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {

    Optional<UserModel> findByName(String username);

=======

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel,Long> {

    Optional<UserModel> findByUsername(String username);

    Optional<UserModel> findByEmail(String email);

    Optional<UserModel> findAllByUsername(String username);
>>>>>>> 3a98c288d77b73e7164d3b3d89d3d94b8c813086
}
