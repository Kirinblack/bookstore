package com.gui.bookstore.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.gui.bookstore.model.enums.StatusRental;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rentals")
public class RentalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate rentalDate;

    @Column(nullable = false)
    private LocalDate forecastDate;

    @Column
    private LocalDate devolutionDate;

    @ManyToOne
    @JsonBackReference
    private BookModel book;

    @ManyToOne
    @JsonBackReference
    private UserModel user;

    @Enumerated(EnumType.STRING)
    private StatusRental status;
}
