package com.gui.bookstore.controller.dto.response;

import com.gui.bookstore.model.PublisherModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookResponseDTO {

    private Long id;

    private String name;

    private Integer quantity;

    private Integer rentedQuantity;

    private LocalDate release;

    private LocalDate changeDate;

    private LocalDate launchDate;

    private String author;

    private PublisherModel publisherModel;
}
