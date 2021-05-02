package com.attomsoft.api.utils.services;

import com.attomsoft.api.utils.entity.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    List<Product> getAllProducts();

    Optional<Product> findProductById(Long id);

}
