package com.gui.bookstore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "Publisher")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false,unique = true,length = 100)
    private String code;

    @Column(nullable = false,length = 100)
    private String city;

    @Column(nullable = false)
    private LocalDate registrationDate;
}
