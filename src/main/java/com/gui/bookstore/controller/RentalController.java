package com.gui.bookstore.controller;


import com.gui.bookstore.controller.dto.request.RentalRequestDTO;
import com.gui.bookstore.controller.dto.response.RentalResponseDTO;
import com.gui.bookstore.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("api/v3/rental")
@CrossOrigin(origins = "*")
public class RentalController implements  RentalControllerDocs {

    @Autowired
    RentalService rentalService ;

    @GetMapping("/{id}")
    public RentalResponseDTO findById(@PathVariable Long id) {
        return rentalService.findById(id);
    }

    @GetMapping
    public Page<RentalResponseDTO> getRentals(Pageable pageable) {
        return rentalService.findAll(pageable);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RentalResponseDTO create(@RequestBody @Valid RentalRequestDTO rentalRequestDTO){
        return rentalService.create(rentalRequestDTO);
    }

    @PutMapping("{id}")
    public RentalResponseDTO update(@PathVariable Long id , @RequestBody @Valid RentalRequestDTO rentalRequestDTO){
        return rentalService.update(id, rentalRequestDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id, @RequestBody @Valid RentalRequestDTO rentalRequestDTO){
        rentalService.deleteById(id);
    }
}
