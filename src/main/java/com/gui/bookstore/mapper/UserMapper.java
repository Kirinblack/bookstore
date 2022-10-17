package com.gui.bookstore.mapper;

import com.gui.bookstore.controller.DTO.Request.UserRequestDTO;
import com.gui.bookstore.controller.DTO.Response.UserResponseDTO;
import com.gui.bookstore.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User toModel(UserRequestDTO userRequestDTO);

    User toModel(UserResponseDTO userResponseDTO);

    UserResponseDTO toDTO(User users);
}
