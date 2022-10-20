package com.gui.bookstore.controller;


import com.gui.bookstore.controller.dto.request.RentalRequestDTO;
import com.gui.bookstore.controller.dto.response.PublisherResponseDTO;
import com.gui.bookstore.controller.dto.response.RentalResponseDTO;
import com.gui.bookstore.mapper.RentalMapper;
import com.gui.bookstore.model.PublisherModel;
import com.gui.bookstore.model.RentalModel;
import com.gui.bookstore.service.RentalInterface;
import com.gui.bookstore.service.implementation.Rentalmpl;
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
    RentalInterface rentalService;

    @Autowired
    private RentalMapper rentalMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RentalResponseDTO create(@RequestBody @Valid RentalRequestDTO rentalRequestDTO){
        RentalModel rentalModel = rentalMapper.toRentalModel(rentalRequestDTO);
        rentalService.create(rentalModel);
        return rentalMapper.toRentalResponse(rentalModel);
    }

    @GetMapping("/{id}")
    public RentalResponseDTO findById(@PathVariable Long id) {
        RentalModel rentalModel = rentalService.findById(id);
        RentalResponseDTO rentalResponseDTO = rentalMapper.toRentalResponse(rentalModel);
        return rentalResponseDTO;
    }

    @GetMapping
    public Page<RentalResponseDTO> getRentals(Pageable pageable) {
        Page<RentalResponseDTO> rentalResponseDTO = rentalService.findAll(pageable).map(rentalMapper::toRentalResponse);
        return rentalResponseDTO;
    }

    @PutMapping("{id}")
    public RentalResponseDTO update(@PathVariable Long id , @RequestBody @Valid RentalRequestDTO rentalRequestDTO){
        RentalModel rentalModel = rentalMapper.toRentalModel(rentalRequestDTO);
        rentalService.update(id,rentalModel);
        RentalResponseDTO rentalResponseDTO = rentalMapper.toRentalResponse(rentalModel);
        return rentalResponseDTO;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id, @RequestBody @Valid RentalRequestDTO rentalRequestDTO){
        rentalService.delete(id);
    }
}
