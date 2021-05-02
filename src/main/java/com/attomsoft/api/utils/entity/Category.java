package com.attomsoft.api.utils.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "categorys" )
public class Category implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    private String name;

    private int stock;

    public int getStock( ) {
        return stock;
    }

    public void setStock( int stock ) {
        this.stock = stock;
    }

    public Long getId( ) {
        return id;
    }

    public String getName( ) {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    private static final long serialVersionUID = 1L;

}
