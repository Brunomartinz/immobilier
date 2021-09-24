/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ninjastech.immobilier.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author Vitor.sas
 */


@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    
    @Override

    protected void configure(HttpSecurity http) throws Exception {
           
           http.authorizeRequests()
          .antMatchers("/private/**")
          .authenticated()
          .antMatchers("/public/**")
          .permitAll()
          .and()
          .httpBasic();
 
    }
    
    
    @Autowired
    protected void configureGlobal(AuthenticationManagerBuilder auth) 
            throws Exception{
        
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        auth.inMemoryAuthentication()
                
                .withUser("vitor").password(encoder.encode("123")).roles("USER","ADMIN")
                .and()
                .withUser("bruno").password(encoder.encode("123")).roles("USER","ADMIN")  
                .and()
                .withUser("arnaldo").password(encoder.encode("123")).roles("USER","ADMIN");  
    }
    

   
}
