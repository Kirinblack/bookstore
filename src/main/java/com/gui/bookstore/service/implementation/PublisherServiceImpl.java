package com.gui.bookstore.service.implementation;

import com.gui.bookstore.model.PublisherModel;
import com.gui.bookstore.repository.PublisherRepository;
import com.gui.bookstore.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class PublisherServiceImpl implements PublisherService {

    @Autowired
    private final PublisherRepository publisherRepository;

    @Override
    public PublisherModel create(PublisherModel publisherModel){
        return publisherRepository.save(publisherModel);
    }

    @Override
    public PublisherModel findById(Long id){
        return publisherRepository.getById(id);
    }

    @Override
    public Page<PublisherModel> findAll(Pageable pageable){
        return publisherRepository.findAll(pageable);
    }

    @Override
    public PublisherModel update(Long id, PublisherModel publisherModel){
        return publisherRepository.save(publisherModel);
    }

    @Override
    public void delete(Long id){
        publisherRepository.deleteById(id);
    }

}
