package com.gui.bookstore.service.implementation;

import com.gui.bookstore.exception.BusinessException;
import com.gui.bookstore.model.PublisherModel;
import com.gui.bookstore.model.validation.PublisherModelValidation;
import com.gui.bookstore.repository.PublisherRepository;
import com.gui.bookstore.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class PublisherServiceImpl implements PublisherService {

    @Autowired
    private final PublisherRepository publisherRepository;

    @Autowired
    private final PublisherModelValidation publisherValidation;

    @Override
    public PublisherModel create(PublisherModel publisherModel){
        publisherValidation.validateForCreate(publisherModel);
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
        Optional<PublisherModel> publisherModelById = publisherRepository.findById(id);
        Optional<PublisherModel> requestPublisherName = publisherRepository.findByName(publisherModel.getName());

        if (!publisherModelById.equals(requestPublisherName)){
            if (requestPublisherName.isPresent()){
                publisherValidation.validateForCreate(publisherModel);
            }
        }

        if (publisherModelById.isEmpty()){
            throw new BusinessException("Editora não foi encontrada");
        }

        publisherModel.setId(id);
        publisherRepository.save(publisherModel);
        return publisherRepository.save(publisherModel);
    }

    @Override
    public void delete(Long id){
        publisherRepository.deleteById(id);
    }

}
