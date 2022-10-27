package com.gui.bookstore.model.validation;

import com.gui.bookstore.controller.dto.request.UserRequestDTO;
import com.gui.bookstore.exception.BusinessException;
import com.gui.bookstore.model.RentalModel;
import com.gui.bookstore.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserModelValidation {

    @Autowired
    private UserRepository userRepository;

    public void validateForCreate(UserRequestDTO userRequestDTO){
        validateName(userRequestDTO.getName());
    }

    private void validateName(String name) {
        userRepository.findByName(name).ifPresent(userModel -> {
            throw new BusinessException(" já existe um leitor(a) com esse nome");
        });
    }

    public void validateRelationship(Long id) {
        List<RentalModel> rentalModel = userRepository.findById(id).get().getRentals();

        if (!rentalModel.isEmpty()) {
            throw new BusinessException("Este leitor(a) tem um aluguel no momento");
        }
    }
}
