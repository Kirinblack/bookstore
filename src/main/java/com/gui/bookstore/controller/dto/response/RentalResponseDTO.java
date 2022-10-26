package com.gui.bookstore.controller.dto.response;


import com.gui.bookstore.model.BookModel;
import com.gui.bookstore.model.UserModel;
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

    private BookModel book;

    private UserModel user;

    private LocalDate rentalDate;

    private LocalDate forecastDate;

    private String returnDate;
}