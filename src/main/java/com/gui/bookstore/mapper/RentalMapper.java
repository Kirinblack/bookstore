package com.gui.bookstore.mapper;

import com.gui.bookstore.controller.dto.request.RentalRequestDTO;
import com.gui.bookstore.controller.dto.response.RentalResponseDTO;
import com.gui.bookstore.model.RentalModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RentalMapper {

    RentalMapper INSTANCE = Mappers.getMapper(RentalMapper.class);

    RentalModel toModel(RentalRequestDTO rentalRequestDTO);

    RentalModel toModel(RentalResponseDTO rentalResponseDTO);

    RentalResponseDTO toDTO(RentalModel rentalModel);
}