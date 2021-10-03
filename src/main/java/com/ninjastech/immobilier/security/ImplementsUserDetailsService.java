package com.ninjastech.immobilier.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ninjastech.immobilier.repositories.UsuarioRepository;

public class ImplementsUserDetailsService implements UserDetailsService {

    private static final ImplementsUserDetailsService INSTANCE = new ImplementsUserDetailsService();

    @Autowired
    public static UsuarioRepository repositoryUser;

    private ImplementsUserDetailsService(){

    }

    public static void setRepositoryUser(UsuarioRepository repositoryUser) {
        ImplementsUserDetailsService.repositoryUser = repositoryUser;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
           UserDetails userDetails = repositoryUser.findBynomeUsuario(username);
           if(userDetails.getUsername().equals(username)){
               return  userDetails;
           }else{
               throw new UsernameNotFoundException("SEM RESULTADOS");
           }
    }

    public static ImplementsUserDetailsService getInstance(){
        return INSTANCE;
    }
}
