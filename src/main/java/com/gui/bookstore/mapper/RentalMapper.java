package com.gui.bookstore.mapper;

import com.gui.bookstore.controller.DTO.Request.RentalRequestDTO;
import com.gui.bookstore.controller.DTO.Response.RentalResponseDTO;
import com.gui.bookstore.model.Rental;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RentalMapper {

    RentalMapper INSTANCE = Mappers.getMapper(RentalMapper.class);

    Rental toModel(RentalRequestDTO rentalRequestDTO);

    Rental toModel(RentalResponseDTO rentalResponseDTO);

    RentalResponseDTO toDTO(Rental rental);
}
