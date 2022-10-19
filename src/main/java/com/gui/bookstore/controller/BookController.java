package com.gui.bookstore.controller;

import com.gui.bookstore.controller.dto.request.BookRequestDTO;
import com.gui.bookstore.controller.dto.response.BookResponseDTO;
import com.gui.bookstore.mapper.BookMapper;
import com.gui.bookstore.model.BookModel;
import com.gui.bookstore.service.BookInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("api/v3/book")
@CrossOrigin(origins = "*")
public class BookController implements BookControllerDocs {

    @Autowired
    private BookInterface bookService;

    @Autowired
    private BookMapper bookMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookResponseDTO create(@RequestBody @Valid BookRequestDTO bookRequestDTO){
        BookModel bookModel = bookMapper.toBookModel(bookRequestDTO);
        bookService.create(bookModel);
        return bookMapper.toBookResponse(bookModel);
    }

    @GetMapping("/{id}")
    public BookResponseDTO findById(@PathVariable Long id){
        BookModel bookModel = bookService.findById(id);
        BookResponseDTO bookResponseDTO = bookMapper.toBookResponse(bookModel);
        return bookResponseDTO;
    }

    @GetMapping()
    public Page<BookResponseDTO> findAll(Pageable pageable){
        Page<BookResponseDTO> bookResponseDTO = bookService.findAll(pageable).map(bookMapper::toBookResponse);
        return bookResponseDTO;
    }

    @PutMapping("/{id}")
    public BookResponseDTO update(@PathVariable Long id, @RequestBody @Valid BookRequestDTO bookRequestDTO){
        BookModel bookModel = bookMapper.toBookModel(bookRequestDTO);
        bookService.update(id,bookModel);
        BookResponseDTO bookResponseDTO = bookMapper.toBookResponse(bookModel);
        return bookResponseDTO;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        bookService.delete(id);
    }
}
