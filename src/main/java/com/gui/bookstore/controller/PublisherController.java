package com.gui.bookstore.controller;


import com.gui.bookstore.controller.DTO.Request.PublisherRequestDTO;
import com.gui.bookstore.controller.DTO.Response.PublisherResponseDTO;
import com.gui.bookstore.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("api/v3/publisher")
@CrossOrigin(origins = "*")
public class PublisherController extends PublisherResponseDTO {

    @Autowired
    PublisherService publisherService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PublisherResponseDTO create(@RequestBody @Valid PublisherRequestDTO publisherRequestDTO){
        return publisherService.create(publisherRequestDTO);
    }
    @GetMapping("/{id}")
    public PublisherResponseDTO findById(@PathVariable Long id){
        return publisherService.findById(id);
    }



    @GetMapping
    public Page<PublisherResponseDTO> findAll(Pageable pageable) {
        return publisherService.findAll(pageable);
    }


    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        publisherService.deleteById(id);
    }

    @PutMapping("/{id}")
    public PublisherResponseDTO update(@PathVariable Long id, @RequestBody @Valid PublisherRequestDTO publisherRequestDTO){
        return  publisherService.update(id, publisherRequestDTO);
    }
}
