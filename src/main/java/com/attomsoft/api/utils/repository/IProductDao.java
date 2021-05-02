package com.attomsoft.api.utils.repository;

import com.attomsoft.api.utils.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductDao extends JpaRepository< Product, Long > {

    List< Product > findAllProductBy( );
}
