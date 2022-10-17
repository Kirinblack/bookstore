package com.gui.bookstore.mapper;

import com.gui.bookstore.controller.dto.request.BookRequestDTO;
import com.gui.bookstore.controller.dto.response.BookResponseDTO;
import com.gui.bookstore.model.BookModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookModel toModel(BookRequestDTO bookRequestDTO);

    BookModel toModel(BookResponseDTO bookResponseDTO);

    BookResponseDTO ToDTO(BookModel bookModel);
}
