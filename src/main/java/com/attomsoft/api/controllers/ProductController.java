package com.attomsoft.api.controllers;

import com.attomsoft.api.utils.entity.Category;
import com.attomsoft.api.utils.entity.Product;
import com.attomsoft.api.utils.services.ICategoryService;
import com.attomsoft.api.utils.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin( origins = { "*" } )
@RequestMapping( "/product" )
public class ProductController {

    @Autowired
    private IProductService productService;

    @Autowired
    private ICategoryService categoryService;

    @GetMapping( "/get-all-products" )
    public List< Product > getAllProducts( ) {

        return productService.getAllProducts( );

    }

    @GetMapping( "/search-product/{id}" )
    public Optional< Product > findProductById( @PathVariable Long id ) {

        return productService.findProductById( id );

    }

    @GetMapping( "/get-all-categorys" )
    public List< Category > getAllCategorys( ) {

        return categoryService.getAllCategorys( );

    }

    @PostMapping( "/create-category" )
    public Category createCategory( Category category ) {

        return categoryService.createCategory( category );

    }
}
