package com.gui.bookstore.mapper;

import com.gui.bookstore.controller.DTO.Request.PublisherRequestDTO;
import com.gui.bookstore.controller.DTO.Response.PublisherResponseDTO;
import com.gui.bookstore.model.Publisher;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PublisherMapper {

    PublisherMapper INSTANCE = Mappers.getMapper(PublisherMapper.class);

    Publisher toModel(PublisherRequestDTO publisherRequestDTO);

    Publisher toModel(PublisherResponseDTO publisherResponseDTO);

    PublisherResponseDTO toDTO(Publisher publisher);
}
