package com.gui.bookstore.model;


<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.gui.bookstore.model.enums.StatusRental;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
=======
import lombok.Getter;
>>>>>>> 3a98c288d77b73e7164d3b3d89d3d94b8c813086
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
<<<<<<< HEAD
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rentals")
public class RentalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
=======
@Entity
@Table(name = "rental")
public class RentalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
>>>>>>> 3a98c288d77b73e7164d3b3d89d3d94b8c813086
    private Long id;

    @Column(nullable = false)
    private LocalDate rentalDate;

    @Column(nullable = false)
    private LocalDate forecastDate;

    @Column
    private LocalDate devolutionDate;

    @ManyToOne
<<<<<<< HEAD
    @JsonBackReference
    private BookModel book;

    @ManyToOne
    @JsonBackReference
    private UserModel user;

    @Enumerated(EnumType.STRING)
    private StatusRental status;
=======
    @JoinColumn(name = "book_id")
    private BookModel bookModel;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel userModel;
>>>>>>> 3a98c288d77b73e7164d3b3d89d3d94b8c813086
}
