package com.attomsoft.api.utils.services;

import com.attomsoft.api.utils.entity.Category;
import com.attomsoft.api.utils.repository.ICategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private ICategoryDao categoryDao;

    @Override
    @Transactional( readOnly = true )
    public List< Category > getAllCategorys( ) {

        return categoryDao.findAll( );

    }

    @Override
    @Transactional
    public Category createCategory( Category category ) {

        return categoryDao.save( category );

    }
}
