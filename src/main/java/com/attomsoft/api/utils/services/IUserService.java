package com.attomsoft.api.utils.services;

import com.attomsoft.api.utils.entity.Usuario;

public interface IUserService {

    Usuario findByUsername(String username);

}
