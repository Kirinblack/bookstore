package com.gui.bookstore.service.implementation;

import com.gui.bookstore.controller.dto.request.BookRequestDTO;
import com.gui.bookstore.exception.BusinessException;
import com.gui.bookstore.exception.IdFoundException;
import com.gui.bookstore.mapper.BookMapper;
import com.gui.bookstore.model.BookModel;
import com.gui.bookstore.model.validation.BookModelValidation;
import com.gui.bookstore.repository.BookRepository;
import com.gui.bookstore.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;


@Service
@RequiredArgsConstructor
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private final BookRepository bookRepository;

    @Autowired
    private final BookMapper bookMapper;

    @Autowired
    private final BookModelValidation bookValidation;


    @Override
    public BookModel create(BookModel bookModel){
        bookValidation.validateForCreate(bookModel);
        return bookRepository.save(bookModel);
    }

    @Override
    public BookModel findById(Long id){
        return bookRepository.getById(id);
    }

    @Override
    public Page<BookModel> findAll(Pageable pageable){
        return bookRepository.findAll(pageable);
    }

    @Override
    public BookModel update(Long id, BookModel bookModel){
        Optional<BookModel> optBook = bookRepository.findById(id);
        Optional<BookModel> optBookName = bookRepository.findByName(bookModel.getName());

        if (!optBookName.equals(optBook)){
            if (optBook.isPresent()){
                bookValidation.validateForCreate(bookModel);
            }
        }

        if (optBook.isEmpty()){
            throw new BusinessException("O livro não foi encontrado");
        }
        bookModel.setId(id);
        bookRepository.save(bookModel);

        return bookRepository.save(bookModel);
    }

    @Override
    public void delete(Long id){
        bookValidation.validateRelationship(id);
        bookRepository.deleteById(id);
    }
}