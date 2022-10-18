package com.gui.bookstore.service;

import com.gui.bookstore.model.BookModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookInterface {

    BookModel create(BookModel bookModel);

    BookModel findById(Long id);

    Page<BookModel> findAll(Pageable pageable);

    BookModel update(Long id, BookModel bookModel);

    void delete(Long id);
}
