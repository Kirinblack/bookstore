package com.gui.bookstore.controller;


import com.gui.bookstore.controller.dto.request.PublisherRequestDTO;
import com.gui.bookstore.controller.dto.response.BookResponseDTO;
import com.gui.bookstore.controller.dto.response.PublisherResponseDTO;
import com.gui.bookstore.mapper.PublisherMapper;
import com.gui.bookstore.model.BookModel;
import com.gui.bookstore.model.PublisherModel;
import com.gui.bookstore.service.PublisherInterface;
import com.gui.bookstore.service.implementation.PublisherImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("api/v3/publisher")
@CrossOrigin(origins = "*")
public class PublisherController implements PublisherControllerDocs {

    @Autowired
    private PublisherInterface publisherService;

    @Autowired
    private PublisherMapper publisherMapper;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PublisherResponseDTO create(@RequestBody @Valid PublisherRequestDTO publisherRequestDTO){
        PublisherModel publisherModel = publisherMapper.toPublisherModel(publisherRequestDTO);
        publisherService.create(publisherModel);
        return publisherMapper.toPublisherResponse(publisherModel);
    }
    @GetMapping("/{id}")
    public PublisherResponseDTO findById(@PathVariable Long id){
        PublisherModel publisherModel = publisherService.findById(id);
        PublisherResponseDTO publisherResponseDTO = publisherMapper.toPublisherResponse(publisherModel);
        return publisherResponseDTO;
    }


    @GetMapping
    public Page<PublisherResponseDTO> findAll(Pageable pageable) {
        Page<PublisherResponseDTO> publisherResponseDTO = publisherService.findAll(pageable).map(publisherMapper::toPublisherResponse);
        return publisherResponseDTO;
    }

    @PutMapping("/{id}")
    public PublisherResponseDTO update(@PathVariable Long id, @RequestBody @Valid PublisherRequestDTO publisherRequestDTO){
        PublisherModel publisherModel = publisherMapper.toPublisherModel(publisherRequestDTO);
        publisherService.update(id,publisherModel);
        PublisherResponseDTO publisherResponseDTO = publisherMapper.toPublisherResponse(publisherModel);
        return publisherResponseDTO;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        publisherService.delete(id);
    }

}
