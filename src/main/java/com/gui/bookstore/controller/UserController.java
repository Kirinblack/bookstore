package com.gui.bookstore.controller;


import com.gui.bookstore.controller.dto.request.UserRequestDTO;
import com.gui.bookstore.controller.dto.response.UserResponseDTO;

import com.gui.bookstore.service.UserService;
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
    UserService userService;

    @GetMapping("/{id}")
    public UserResponseDTO getById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDTO create(@RequestBody @Valid UserRequestDTO userToCreateDTO) {
        return userService.create(userToCreateDTO);
    }

    @GetMapping
    public Page<UserResponseDTO> findAll(Pageable pageable) {
        return userService.findAll(pageable);
    }

    @PutMapping("{id}")
    public UserResponseDTO update(@PathVariable Long id, @RequestBody @Valid UserRequestDTO userRequestDTO) {
        return userService.update(id,userRequestDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id, @RequestBody @Valid UserRequestDTO userRequestDTO) {
        userService.delete(id);
    }
}
