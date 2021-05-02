package com.attomsoft.api.utils.services;

import com.attomsoft.api.utils.entity.Publication;
import com.attomsoft.api.utils.repository.IProductDao;
import com.attomsoft.api.utils.repository.IPublicationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PublicationServiceImpl implements IPublicationService {

    @Autowired
    private IPublicationDao publicationDao;

    @Override
    @Transactional(readOnly = true)
    public List<Publication> getAllPublications() {

        return publicationDao.findAll();

    }
}
