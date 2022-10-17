package com.gui.bookstore.mapper;

import com.gui.bookstore.controller.dto.request.PublisherRequestDTO;
import com.gui.bookstore.controller.dto.response.PublisherResponseDTO;
import com.gui.bookstore.model.PublisherModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PublisherMapper {

    PublisherMapper INSTANCE = Mappers.getMapper(PublisherMapper.class);

    PublisherModel toModel(PublisherRequestDTO publisherRequestDTO);

    PublisherModel toModel(PublisherResponseDTO publisherResponseDTO);

    PublisherResponseDTO toDTO(PublisherModel publisherModel);
}
