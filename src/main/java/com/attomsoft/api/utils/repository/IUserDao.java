package com.attomsoft.api.utils.repository;

import com.attomsoft.api.utils.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDao extends JpaRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}
