package com.gui.bookstore.controller;


import com.gui.bookstore.controller.dto.request.UserRequestDTO;
import com.gui.bookstore.controller.dto.response.UserResponseDTO;

import com.gui.bookstore.mapper.UserMapper;
import com.gui.bookstore.model.UserModel;
<<<<<<< HEAD
import com.gui.bookstore.service.UserService;
=======
import com.gui.bookstore.service.UserInterface;
>>>>>>> 3a98c288d77b73e7164d3b3d89d3d94b8c813086
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("api/v3/user")
@CrossOrigin(origins = "*")
public class UserController implements UserControllerDocs {

    @Autowired
<<<<<<< HEAD
    private UserService userService;
=======
    UserInterface userService;
>>>>>>> 3a98c288d77b73e7164d3b3d89d3d94b8c813086

    @Autowired
    private UserMapper userMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDTO create(@RequestBody @Valid UserRequestDTO userRequestDTO) {
        UserModel userModel = userMapper.toUserModel(userRequestDTO);
        userService.create(userModel);
        return userMapper.toUserResponse(userModel);
    }

    @GetMapping("/{id}")
    public UserResponseDTO getById(@PathVariable Long id) {
        UserModel userModel = userService.findById(id);
        UserResponseDTO userResponseDTO = userMapper.toUserResponse(userModel);
        return userResponseDTO;
    }

    @GetMapping
    public Page<UserResponseDTO> findAll(Pageable pageable) {
        Page<UserResponseDTO> userResponseDTO = userService.findAll(pageable).map(userMapper::toUserResponse);
        return userResponseDTO;
    }

    @PutMapping("{id}")
    public UserResponseDTO update(@PathVariable Long id, @RequestBody @Valid UserRequestDTO userRequestDTO) {
        UserModel userModel = userMapper.toUserModel(userRequestDTO);
        userService.update(id,userModel);
        UserResponseDTO userResponseDTO = userMapper.toUserResponse(userModel);
        return userResponseDTO;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id, @RequestBody @Valid UserRequestDTO userRequestDTO) {
        userService.delete(id);
    }
}
