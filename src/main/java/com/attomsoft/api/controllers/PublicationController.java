package com.attomsoft.api.controllers;

import com.attomsoft.api.utils.entity.Publication;
import com.attomsoft.api.utils.services.IPublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin( origins = { "*" } )
@RequestMapping( "/publication" )
public class PublicationController {

    @Autowired
    private IPublicationService publicationService;

    @GetMapping( "/get-all-publications" )
    public List< Publication > getAllPublications( ) {

        return publicationService.getAllPublications( );

    }

}
