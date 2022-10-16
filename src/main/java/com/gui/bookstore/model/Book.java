package com.gui.bookstore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String name;

    @Column(columnDefinition =  "integer default 0")
    private int quantity;

    @Column(columnDefinition =  "integer default 0")
    private int requentQuantity;

    @Column(nullable = false)
    private LocalDate release;

    @Column(nullable = false)
    private LocalDate changeDate;

    @Column(nullable = false)
    private LocalDate launchDate;

    @Column(nullable = false)
    private String author;

    @ManyToOne(cascade = {CascadeType.MERGE})
    private Publisher publisher;
}
