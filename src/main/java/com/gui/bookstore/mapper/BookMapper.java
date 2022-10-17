package com.gui.bookstore.mapper;

import com.gui.bookstore.controller.DTO.Request.BookRequestDTO;
import com.gui.bookstore.controller.DTO.Response.BookResponseDTO;
import com.gui.bookstore.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookRequestDTO bookRequestDTO);

    Book toModel(BookResponseDTO bookResponseDTO);

    BookResponseDTO ToDTO(Book book);
}
