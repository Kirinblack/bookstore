package com.gui.bookstore.service;

import com.gui.bookstore.model.PublisherModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PublisherInterface {

    PublisherModel create(PublisherModel publisherModel);

    PublisherModel findById(Long id);

    Page<PublisherModel> findAll(Pageable pageable);

    PublisherModel update(Long id, PublisherModel publisherModel);

    void delete(Long id);
}
