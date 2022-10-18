//package com.gui.bookstore.controller;
//
//
//import com.gui.bookstore.controller.dto.request.PublisherRequestDTO;
//import com.gui.bookstore.controller.dto.response.PublisherResponseDTO;
//import com.gui.bookstore.service.PublisherInterface;
//import com.gui.bookstore.service.implementation.PublisherImpl;
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
//@RequestMapping("api/v3/publisher")
//@CrossOrigin(origins = "*")
//public class PublisherController implements PublisherControllerDocs {
//
//    @Autowired
//    PublisherInterface publisherImpl;
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public PublisherResponseDTO create(@RequestBody @Valid PublisherRequestDTO publisherRequestDTO){
//      return publisherImpl.create(publisherRequestDTO);
//    }
//    @GetMapping("/{id}")
//    public PublisherResponseDTO findById(@PathVariable Long id){
//      return publisherImpl.findById(id);
//    }
//
//
//    @GetMapping
//    public Page<PublisherResponseDTO> findAll(Pageable pageable) {
//      return publisherImpl.findAll(pageable);
//    }
//
//
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void delete(@PathVariable Long id, @RequestBody @Valid PublisherRequestDTO PublisherRequestDTO){
//      publisherImpl.deleteById(id);
//    }
//
//    @PutMapping("/{id}")
//    public PublisherResponseDTO update(@PathVariable Long id, @RequestBody @Valid PublisherRequestDTO publisherRequestDTO){
//      return  publisherImpl.update(id, publisherRequestDTO);
//    }
//}
