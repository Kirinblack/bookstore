//package com.gui.bookstore.controller;
//
//
//import com.gui.bookstore.controller.dto.request.PublisherRequestDTO;
//import com.gui.bookstore.controller.dto.response.PublisherResponseDTO;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiResponse;
//import io.swagger.annotations.ApiResponses;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//
//@Api("Publishers management")
//public interface PublisherControllerDocs {
//
//    @ApiOperation(value = "PublisherModel creation operation")
//    @ApiResponses(value = {
//            @ApiResponse(code = 201, message = "Success publisher creation"),
//            @ApiResponse(code = 400, message = "Missing required fields, wrong field range value or publisher already registered on system")
//    })
//    PublisherResponseDTO create(PublisherRequestDTO publisherRequestDTO);
//
//    @ApiOperation(value = "Find publisher by id operation")
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Success publisher found"),
//            @ApiResponse(code = 404, message = "PublisherModel not found error")
//    })
//    PublisherResponseDTO findById(Long id);
//
//    @ApiOperation(value = "List all registered publishers")
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Return all registered publishers")
//    })
//    Page<PublisherResponseDTO> findAll(Pageable pageable);
//
//    @ApiOperation(value = "Delete publisher by id operation")
//    @ApiResponses(value = {
//    @ApiResponse(code = 204, message = "Success publisher deleted"),
//      @ApiResponse(code = 404, message = "PublisherModel not found error")
//})
//void delete(Long id, PublisherRequestDTO publisherRequestDTO);

//@ApiOperation(value = "PublisherModel update operation")
//@ApiResponses(value = {
//    @ApiResponse(code = 200, message = "Success publisher update"),
//      @ApiResponse(code = 400, message = "Missing required field, or an error on validation field rules")
//})
//  PublisherResponseDTO update(Long id, PublisherRequestDTO publisherRequestDTO);
//}
