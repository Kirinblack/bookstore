package com.gui.bookstore.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String name;

    @Column(columnDefinition =  "integer default 0")
    private int quantity;

    @Column(columnDefinition =  "integer default 0")
    private int minimumQuantity;

    @Column(nullable = false)
    private LocalDate release;

    @Column(nullable = false)
    private String author;

    @ManyToOne
    private PublisherModel publisher;

    @JsonManagedReference
    @OneToMany(mappedBy = "book")
    private List <RentalModel> rentals;
}
