package com.gui.bookstore.mapper;

import com.gui.bookstore.controller.dto.request.PublisherRequestDTO;
import com.gui.bookstore.controller.dto.response.PublisherResponseDTO;
import com.gui.bookstore.model.PublisherModel;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PublisherMapper {

    private final ModelMapper mapper = new ModelMapper();

    public PublisherModel toPublisherModel(PublisherRequestDTO publisher){
        return mapper.map(publisher, PublisherModel.class);
    }

    public PublisherRequestDTO toPublisherRequest(PublisherModel publisher){
        return mapper.map(publisher, PublisherRequestDTO.class);
    }

    public PublisherResponseDTO toPublisherResponse(PublisherModel publisher){
        return mapper.map(publisher, PublisherResponseDTO.class);
    }


}