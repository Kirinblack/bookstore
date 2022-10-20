package com.gui.bookstore.controller;

import com.gui.bookstore.controller.dto.request.UserRequestDTO;
import com.gui.bookstore.controller.dto.response.UserResponseDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Api("System users management")
public interface UserControllerDocs {

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success, message realized"),
            @ApiResponse(code = 400, message = "Missing data. Check and try again.")
    })
    @ApiOperation(value = "Create a new message")
    UserResponseDTO create(UserRequestDTO userToCreateDTO);



    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success to get the user"),
            @ApiResponse(code = 400, message = "Missing data. Check and try again.")
    })
    @ApiOperation(value = "Get user by id")
    UserResponseDTO getById(Long id);


    //MessageDTO update(Long id, UserRequestDTO userToUpdateDTO);

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success to get the user"),
            @ApiResponse(code = 400, message = "Missing data. Check and try again.")
    })
    @ApiOperation(value = "Get user by id")
    Page<UserResponseDTO> findAll(Pageable pageable);


    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "UserModel updated"),
            @ApiResponse(code = 400, message = "Missing data. Check and try again.")
    })
    @ApiOperation(value = "Update a user")
    public UserResponseDTO update(Long id, UserRequestDTO userRequestDTO);


    @ApiOperation(value = "Delete a user by id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success, id deleted"),
            @ApiResponse(code = 400, message = "Missing data. Check and try again.")
    })
    void delete(Long id, UserRequestDTO userRequestDTO);

}
