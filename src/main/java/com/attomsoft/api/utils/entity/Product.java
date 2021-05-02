package com.attomsoft.api.utils.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "products" )
public class Product implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    private String name;

    private float price;

    private Boolean enabled;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "category_id" )
    @JsonIgnoreProperties( { "hibernateLazyInitializer" , "handler" } )
    private Category category;

    public Category getCategory( ) {
        return category;
    }

    public void setCategory( Category category ) {
        this.category = category;
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

    public float getPrice( ) {
        return price;
    }

    public void setPrice( float price ) {
        this.price = price;
    }

    public Boolean getEnabled( ) {
        return enabled;
    }

    public void setEnabled( Boolean enabled ) {
        this.enabled = enabled;
    }

    private static final long serialVersionUID = 1L;

}
