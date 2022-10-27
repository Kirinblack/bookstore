package com.gui.bookstore.service;

import com.gui.bookstore.model.RentalModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RentalInterface {

    RentalModel create(RentalModel rentalModel);

    RentalModel findById(Long id);

    Page<RentalModel> findAll(Pageable pageable);

    RentalModel update(Long id, RentalModel rentalModel);

    void delete(Long id);
}
