package com.attomsoft.api.utils.services;

import com.attomsoft.api.utils.entity.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import com.attomsoft.api.utils.repository.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService, UserDetailsService {

    private Logger logger = LoggerFactory.getLogger( UserService.class );

    @Autowired
    private IUserDao userDao;

    @Override
    @Transactional( readOnly = true )
    public UserDetails loadUserByUsername( String username ) throws UsernameNotFoundException {

        Usuario user = userDao.findByUsername( username );

        if ( user == null ) {

            logger.error( "Error: no existe el usuario en el sistema" );

            throw new UsernameNotFoundException( "Error: no existe el usuario en el sistema" );

        }

        List< GrantedAuthority > authorities = user
                .getRoles( )
                .stream( )
                .map( role -> new SimpleGrantedAuthority( role.getName( ) ) )
                .peek( authority -> logger.info( "Role: " + authority.getAuthority( ) ) )
                .collect( Collectors.toList( ) );

        return new User( user.getUsername( ) , user.getPassword( ) , user.getEnabled( ) , true , true , true , authorities );

    }

    @Override
    @Transactional( readOnly = true )
    public Usuario findByUsername( String username ) {

        return userDao.findByUsername( username );

    }
}
