//package com.gui.bookstore.repository;
//
//import com.gui.bookstore.model.UserModel;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import java.util.Optional;
//
//public interface UserRepository extends JpaRepository<UserModel,Long> {
//
//    Optional<UserModel> findByUsername(String username);
//
//    Optional<UserModel> findByEmail(String email);
//
//    Optional<UserModel> findAllByUsername(String username);
//}
