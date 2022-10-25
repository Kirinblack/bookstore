package com.gui.bookstore.service;

import com.gui.bookstore.model.UserModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    UserModel create(UserModel userModel);

    UserModel findById(Long id);

    Page<UserModel> findAll(Pageable pageable);

    UserModel update(Long id, UserModel userModel);

    void delete(Long id);
}
