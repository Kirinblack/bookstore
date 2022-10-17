package com.gui.bookstore.controller.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookRequestDTO {

    private Long id;

    @NotNull
    @NotEmpty
    @Size(max = 100)
    private String name;

    @NotNull
    private Integer quantity;

    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate release;

    @NotNull
    @NotEmpty
    private String author;

    @NotNull
    private Long publisherId ;
}
