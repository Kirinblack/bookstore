package com.gui.bookstore.mapper;

import com.gui.bookstore.controller.dto.request.RentalRequestDTO;
import com.gui.bookstore.controller.dto.response.RentalResponseDTO;
import com.gui.bookstore.model.RentalModel;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RentalMapper {

    private final ModelMapper mapper = new ModelMapper();

    public RentalModel toRentalModel(RentalRequestDTO rental){
        TypeMap<RentalRequestDTO,RentalModel> typeMap = mapper.getTypeMap(RentalRequestDTO.class, RentalModel.class);

        if (typeMap == null){
            mapper.addMappings(new PropertyMap<RentalRequestDTO, RentalModel>() {
                @Override
               protected void configure(){
                    skip(destination.getId());
                }
            });
        }

        return mapper.map(rental, RentalModel.class);
    }

    public RentalRequestDTO toRentalRequest(RentalModel rental){
        return mapper.map(rental, RentalRequestDTO.class);
    }

    public RentalResponseDTO toRentalResponse(RentalModel rental){
        return mapper.map(rental, RentalResponseDTO.class);
    }

}