package com.attomsoft.api.utils.services;

import com.attomsoft.api.utils.entity.Product;
import com.attomsoft.api.utils.repository.IProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Override
    @Transactional(readOnly = true)
    public List<Product> getAllProducts() {

        return productDao.findAll();

    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Product> findProductById(Long id) {

        return productDao.findById(id);

    }
}
