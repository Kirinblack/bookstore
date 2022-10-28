package com.gui.bookstore.model.validation;

import com.gui.bookstore.controller.dto.request.RentalRequestDTO;
import com.gui.bookstore.exception.BusinessException;
import com.gui.bookstore.model.BookModel;
import com.gui.bookstore.model.RentalModel;
import com.gui.bookstore.model.enums.StatusRental;
import com.gui.bookstore.repository.BookRepository;
import com.gui.bookstore.repository.RentalRepository;
import com.gui.bookstore.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class RentalModelValidation {

    @Autowired
    private RentalRepository rentRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    public void validateBookRent(BookModel bookModel){
        validateAmount(bookModel.getQuantity());

    }

    private void validateAmount(Integer amount) {
        if (amount <= 0){
            throw new BusinessException("Não existem cópias disponíveis deste livro");
        }
    }

    public void validateForCreate(RentalModel rentalModel ){
        validateBook(rentalModel.getBook().getId());
        validateUser(rentalModel.getUser().getId());
        validateDevolution(rentalModel.getRentalDate(), rentalModel.getForecastDate());

    }

    private void validateBook(Long id) {
        if (bookRepository.findById(id).isEmpty()){
            throw new BusinessException("Livro não foi encontrado");
        }
    }

    private void validateUser(Long id) {
        if (userRepository.findById(id).isEmpty()){
            throw new BusinessException("Leitor(a) não foi encontrado");
        }
    }

    private void validateDevolution(LocalDate rentalDate, LocalDate forecastDate) {
        if (rentalDate.isAfter(forecastDate)){
            throw new BusinessException("A data de aluguel não pode ser posterior à data de devolução");
        }
        if (rentalDate.isAfter(LocalDate.now())){
            throw new BusinessException("O aluguel deve ser feito na data presente ou anterior");
        }
    }

    public void validateForDelete(Long id) {
        StatusRental status = rentRepository.findById(id).get().getStatus();

        if (status.equals(StatusRental.LENDO)){
            throw new BusinessException("Este aluguel está em progresso");
        }
    }
}
