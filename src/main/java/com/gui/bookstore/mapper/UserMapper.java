package com.gui.bookstore.mapper;

import com.gui.bookstore.controller.dto.request.UserRequestDTO;
import com.gui.bookstore.controller.dto.response.UserResponseDTO;
import com.gui.bookstore.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

<<<<<<< HEAD
@Component
=======
@Component("Mapper")
>>>>>>> 3a98c288d77b73e7164d3b3d89d3d94b8c813086
@RequiredArgsConstructor
public class UserMapper {

    private final ModelMapper mapper = new ModelMapper();

    public UserModel toUserModel(UserRequestDTO user){
        return mapper.map(user, UserModel.class);
    }

    public UserRequestDTO toUserRequest(UserModel user){
        return mapper.map(user, UserRequestDTO.class);
    }

    public UserResponseDTO toUserResponse(UserModel user){
        return mapper.map(user, UserResponseDTO.class);
    }
}
