package com.attomsoft.api.auth;

import com.attomsoft.api.utils.entity.Usuario;
import com.attomsoft.api.utils.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class InfoAdditionalToken implements TokenEnhancer {

    @Autowired
    private IUserService userService;

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {

        Usuario usuario = userService.findByUsername(authentication.getName());

        Map<String, Object> info = new HashMap<>();

        info.put("info_adicional", "Hola que tal!: ".concat(authentication.getName()));
        info.put("user_id", usuario.getId());
        info.put("user_name", usuario.getUsername());
        info.put("name", usuario.getName().concat(" ").concat(usuario.getLastName()));
        info.put("user_email", usuario.getEmail());

        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);

        return accessToken;

    }
}
