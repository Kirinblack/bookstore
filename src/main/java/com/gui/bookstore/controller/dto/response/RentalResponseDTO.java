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

<<<<<<< HEAD
    private BookModel book;

    private UserModel user;

    private LocalDate rentalDate;

    private LocalDate forecastDate;
=======
    private BookModel bookModel;

    private UserModel userModel;

    private LocalDate rentalDate;

    private LocalDate returnForecast;
>>>>>>> 3a98c288d77b73e7164d3b3d89d3d94b8c813086

    private String returnDate;
}