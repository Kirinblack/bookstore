package com.gui.bookstore.model.validation;

import com.gui.bookstore.controller.dto.request.PublisherRequestDTO;
import com.gui.bookstore.exception.BusinessException;
import com.gui.bookstore.exception.IdFoundException;
import com.gui.bookstore.model.BookModel;
import com.gui.bookstore.model.PublisherModel;
import com.gui.bookstore.repository.BookRepository;
import com.gui.bookstore.repository.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class PublisherModelValidation {

    @Autowired
    private PublisherRepository publisherRepository;

    @Autowired
    private BookRepository bookRepository;

    public void validateForCreate(PublisherModel publisherModel) {
        validateName(publisherModel.getName());
    }

    public void validateForDelete(Long id) {
        validateRelationship(id);
    }

    private void validateName(String name) {
        publisherRepository.findByName(name).ifPresent(publisherModel -> {
            throw new BusinessException("Já existe uma editora registrada com esse nome");
        });
    }

    public void validateId(Long id){
        if (publisherRepository.findById(id).isEmpty()){
            throw new IdFoundException(id);
        }
    }

    public void validateRelationship(Long id) {
        Optional<BookModel> book = bookRepository.findByPublisherId(id);

        if (!book.isEmpty()) {
            throw new BusinessException("Existem livros registrados com essa editora");
        }

    }
}
