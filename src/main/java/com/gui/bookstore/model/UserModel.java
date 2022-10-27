package com.gui.bookstore.model;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
=======
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
>>>>>>> 3a98c288d77b73e7164d3b3d89d3d94b8c813086
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

<<<<<<< HEAD
    @Column(nullable = false)
=======
    @Column(nullable = false, length = 100)
>>>>>>> 3a98c288d77b73e7164d3b3d89d3d94b8c813086
    private String email;

    @Column(nullable = false)
    private String city;

<<<<<<< HEAD
    @Column(nullable = false)
    private String address;

    @Column(nullable = false, unique = true)
=======
    @Column(nullable = false, length = 100)
    private String address;

    @Column(nullable = false, unique = true, length = 30)
>>>>>>> 3a98c288d77b73e7164d3b3d89d3d94b8c813086
    private String username;

    @Column(nullable = false)
    private String password;
<<<<<<< HEAD

    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    private List<RentalModel> rentals;
=======
>>>>>>> 3a98c288d77b73e7164d3b3d89d3d94b8c813086
}
