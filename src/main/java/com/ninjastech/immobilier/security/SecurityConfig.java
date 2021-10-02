/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ninjastech.immobilier.security;
import com.ninjastech.immobilier.entities.Usuario;
import com.ninjastech.immobilier.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author Vitor.sas
 */


@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    private UsuarioRepository userRepository;


    @Override
    protected void configure(HttpSecurity http) throws Exception {
           
           http.authorizeRequests()
          .antMatchers("/private/**")
          .authenticated()
          .antMatchers("/public/**")
          .permitAll()
          .and()
          .httpBasic();

          http.authorizeRequests()
          .antMatchers("/h2-console/**").hasRole("ADMIN")//allow h2 console access to admins only
          .anyRequest().authenticated()//all other urls can be access by any authenticated role
          //.and().formLogin()//enable form login instead of basic login
          .and().csrf().ignoringAntMatchers("/h2-console/**")//don't apply CSRF protection to /h2-console
          .and().headers().frameOptions().sameOrigin();//allow use of frame to same origin urls
          
          http.csrf().disable();
 
    }
    
    
    @Autowired
    protected void configureGlobal(AuthenticationManagerBuilder auth) 
            throws Exception{

        /*
        ImplementsUserDetailsService uds = ImplementsUserDetailsService.getInstance();
        uds.setRepositoryUser(userRepository);
        uds.loadUserByUsername("SENAC");
         */

        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser("sa").password(encoder.encode("sa")).roles("USER","ADMIN");
                /*
                .and()
                .withUser("bruno").password(encoder.encode("123")).roles("USER","ADMIN")
                .and()
                .withUser("arnaldo").password(encoder.encode("123")).roles("USER","ADMIN")
                .and()
                .withUser("gaby").password(encoder.encode("123")).roles("USER","ADMIN");
                 */

    }
    

   
}
