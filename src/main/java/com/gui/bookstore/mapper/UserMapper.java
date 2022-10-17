package com.gui.bookstore.mapper;

import com.gui.bookstore.controller.dto.request.UserRequestDTO;
import com.gui.bookstore.controller.dto.response.UserResponseDTO;
import com.gui.bookstore.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);


    UserModel toModel(UserRequestDTO userRequestDTO);

    UserModel toModel(UserResponseDTO userResponseDTO);

    UserResponseDTO toDTO(UserModel users);
}
