package com.gui.bookstore.model.validation;

import com.gui.bookstore.controller.dto.request.BookRequestDTO;
import com.gui.bookstore.exception.BusinessException;
import com.gui.bookstore.model.BookModel;
import com.gui.bookstore.model.RentalModel;
import com.gui.bookstore.model.enums.StatusRental;
import com.gui.bookstore.repository.BookRepository;
import com.gui.bookstore.repository.PublisherRepository;
import com.gui.bookstore.repository.RentalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BookModelValidation {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private RentalRepository rentalRepository;

    @Autowired
    private PublisherRepository publisherRepository;

    public void validateForCreate(BookModel bookModel){
        validateName(bookModel.getName());
        validatePublisher(bookModel.getPublisher().getId());
    }

    private void validatePublisher(Long publisher) {

        if (publisherRepository.findById(publisher).isEmpty()){
            throw new BusinessException("Editora não encontrada");
        }
    }

    private void validateName(String name) {
        bookRepository.findByName(name).ifPresent(bookModel -> {
            throw new BusinessException("Um livro com esse nome já foi registrado");
        });
    }

    public void validateRelationship(Long id) {
        List<RentalModel> rental = bookRepository.findById(id).get().getRentals();

        for (RentalModel rentalModel : rental) {
            if (rentalModel.getStatus().equals(StatusRental.LENDO)) {
                throw new BusinessException("Este livro está sendo alugado no momento");
            }
        }
    }

}
