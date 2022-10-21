package com.gui.bookstore.service.implementation;

import com.gui.bookstore.model.UserModel;
import com.gui.bookstore.repository.UserRepository;
import com.gui.bookstore.service.UserInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserImpl implements UserInterface {

    @Autowired
    private final UserRepository userRepository;

    @Override
    public UserModel create(UserModel userModel){
        return userRepository.save(userModel);
    }

    @Override
    public UserModel findById(Long id){
        return userRepository.getById(id);
    }

    @Override
    public Page<UserModel> findAll(Pageable pageable){
        return userRepository.findAll(pageable);
    }

    @Override
    public UserModel update(Long id, UserModel userModel){
        return userRepository.save(userModel);
    }

    @Override
    public void delete(Long id){
        userRepository.deleteById(id);
    }
}
