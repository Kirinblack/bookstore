package com.gui.bookstore.controller;

import com.gui.bookstore.controller.DTO.Request.BookRequestDTO;
import com.gui.bookstore.controller.DTO.Response.BookResponseDTO;
import com.gui.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("api/v2/book")
@CrossOrigin(origins = "*")
public class BookController implements BookControllerDocs {

    @Autowired
    BookService bookService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookResponseDTO create(@RequestBody @Valid BookRequestDTO bookRequestDTO){
        return bookService.create(bookRequestDTO);
    }

    @GetMapping("/{id}")
    public BookResponseDTO findById(@PathVariable Long id){
        return bookService.findById(id);
    }

    @Override
    @GetMapping()
    public Page<BookResponseDTO> findAll(Pageable pageable){
        return bookService.findAll(pageable);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id,@RequestBody @Valid BookRequestDTO bookRequestDTO){
        bookService.deleteById(id);
    }

    @PutMapping("/{id}")
    public BookResponseDTO update(@PathVariable Long id,@RequestBody @Valid BookRequestDTO bookRequestDTO){
        return bookService.update(id,bookRequestDTO);
    }
}
