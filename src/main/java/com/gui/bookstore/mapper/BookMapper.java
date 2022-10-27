package com.gui.bookstore.mapper;

import com.gui.bookstore.controller.dto.request.BookRequestDTO;
import com.gui.bookstore.controller.dto.response.BookResponseDTO;
import com.gui.bookstore.model.BookModel;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookMapper {

    private final ModelMapper mapper = new ModelMapper();

    public BookModel toBookModel(BookRequestDTO book) {
        return mapper.map(book, BookModel.class);
    }

    public BookRequestDTO toBookRequest(BookModel book) {
        return mapper.map(book, BookRequestDTO.class);
    }

    public BookResponseDTO toBookResponse(BookModel book) {
        return mapper.map(book, BookResponseDTO.class);
    }
}