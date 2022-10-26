package com.gui.bookstore.controller;


import com.gui.bookstore.controller.dto.request.RentalRequestDTO;
import com.gui.bookstore.controller.dto.response.RentalResponseDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Api("System users management")
public interface RentalControllerDocs {

    @ApiOperation(value = "Create a new book")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success Rentals creation"),
            @ApiResponse(code = 400, message = "Missing data. Check and try again.")
    })
    RentalResponseDTO create(RentalRequestDTO rentalsRequestDTO);

    @ApiOperation(value = "Find a result by id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success search"),
            @ApiResponse(code = 400, message = "Missing data. Check and try again.")
    })
    RentalResponseDTO findById(Long id);

    @ApiOperation(value = "Get all rentals")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success Rentals creation"),
            @ApiResponse(code = 400, message = "Missing data. Check and try again.")
    })
    Page<RentalResponseDTO> findAll(Pageable pageable);

    @ApiOperation(value = "Update a new book")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "success Rentals update"),
            @ApiResponse(code = 400, message = "Missing data. Check and try again.")
    })
    RentalResponseDTO update(Long id, RentalRequestDTO rentalRequestDTO);

    @ApiOperation(value = "Delete a rental by id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success, id deleted"),
            @ApiResponse(code = 400, message = "Missing data. Check and try again.")
    })
    void delete(Long id, RentalRequestDTO rentalRequestDTO);
}
