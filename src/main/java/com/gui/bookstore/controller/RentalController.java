//package com.gui.bookstore.controller;
//
//
//import com.gui.bookstore.controller.dto.request.RentalRequestDTO;
//import com.gui.bookstore.controller.dto.response.RentalResponseDTO;
//import com.gui.bookstore.service.RentalInterface;
//import com.gui.bookstore.service.implementation.Rentalmpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//
//
//@RestController
//@RequestMapping("api/v3/rental")
//@CrossOrigin(origins = "*")
//public class RentalController implements  RentalControllerDocs {
//
//    @Autowired
//    RentalInterface rentalmpl;
//
//    @GetMapping("/{id}")
//    public RentalResponseDTO findById(@PathVariable Long id) {
//        return rentalmpl.findById(id);
//    }
//
//    @GetMapping
//    public Page<RentalResponseDTO> getRentals(Pageable pageable) {
//        return rentalmpl.findAll(pageable);
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public RentalResponseDTO create(@RequestBody @Valid RentalRequestDTO rentalRequestDTO){
//        return rentalmpl.create(rentalRequestDTO);
//    }
//
//    @PutMapping("{id}")
//    public RentalResponseDTO update(@PathVariable Long id , @RequestBody @Valid RentalRequestDTO rentalRequestDTO){
//        return rentalmpl.update(id, rentalRequestDTO);
//    }
//
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void delete(@PathVariable Long id, @RequestBody @Valid RentalRequestDTO rentalRequestDTO){
//        rentalmpl.deleteById(id);
//    }
//}
