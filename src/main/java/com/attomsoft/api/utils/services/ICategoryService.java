package com.attomsoft.api.utils.services;

import com.attomsoft.api.utils.entity.Category;

import java.util.List;

public interface ICategoryService {

    List< Category > getAllCategorys( );

    Category createCategory( Category category );

}
