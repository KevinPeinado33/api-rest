package com.attomsoft.api.utils.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table( name = "roles" )
public class Role implements Serializable {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;

    @Column( unique = true, length = 20 )
    private String name;

    /**
     * Usamos el cascade = CascadeType.ALL, para eliminar los que esten relacionados
     */
    @ManyToMany( mappedBy = "roles" )
    private List< Usuario > users;

    public List< Usuario > getUsers( ) {
        return users;
    }

    public void setUsers( List< Usuario > users ) {
        this.users = users;
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
