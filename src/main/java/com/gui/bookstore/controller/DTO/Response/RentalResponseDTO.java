package com.gui.bookstore.controller.DTO.Response;


import com.gui.bookstore.model.Book;
import com.gui.bookstore.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RentalResponseDTO {

    private Long id;

    private Book book;

    private User user;

    private LocalDate rentalDate;

    private LocalDate returnForecast;

    private String returnDate;
}
