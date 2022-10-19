//package com.gui.bookstore.model;
//
//
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.time.LocalDate;
//
//@Getter
//@Setter
//@Entity
//@Table(name = "rental")
//public class RentalModel {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @Column(nullable = false)
//    private LocalDate rentalDate;
//
//    @Column(nullable = false)
//    private LocalDate forecastDate;
//
//    @Column
//    private LocalDate devolutionDate;
//
//    @ManyToOne
//    @JoinColumn(name = "book_id")
//    private BookModel bookModel;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private UserModel userModel;
//}
