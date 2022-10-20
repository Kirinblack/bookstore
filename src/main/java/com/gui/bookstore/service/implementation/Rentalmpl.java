package com.gui.bookstore.service.implementation;

import com.gui.bookstore.model.PublisherModel;
import com.gui.bookstore.model.RentalModel;
import com.gui.bookstore.repository.RentalRepository;
import com.gui.bookstore.service.RentalInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class Rentalmpl implements RentalInterface {

    @Autowired
    private final RentalRepository rentalRepository;

    @Override
    public RentalModel create(RentalModel rentalModel){
        return rentalRepository.save(rentalModel);
    }

    @Override
    public RentalModel findById(Long id){
        return rentalRepository.getById(id);
    }

    @Override
    public Page<RentalModel> findAll(Pageable pageable){
        return rentalRepository.findAll(pageable);
    }

    @Override
    public RentalModel update(Long id, RentalModel rentalModel){
        return rentalRepository.save(rentalModel);
    }

    @Override
    public void delete(Long id){
        rentalRepository.deleteById(id);
    }

}
