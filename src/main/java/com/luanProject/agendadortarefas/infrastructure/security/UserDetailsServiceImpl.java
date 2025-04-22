package com.luanProject.agendadortarefas.infrastructure.security;

import com.luanProject.agendadortarefas.business.dto.UsuarioDTO;
import com.luanProject.agendadortarefas.infrastructure.client.UsuarioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl{

    @Autowired
    private UsuarioClient client;

    public UserDetails loadUserByUsername(String userName, String token){

        UsuarioDTO usuarioDTO = client.buscaUsuarioPorEmail(userName, token);
        return User
                .withUsername(usuarioDTO.getEmail()) // Define o nome de usuário como o e-mail
                .password(usuarioDTO.getSenha()) // Define a senha do usuário
                .build(); // Constrói o objeto UserDetails

    }
}
