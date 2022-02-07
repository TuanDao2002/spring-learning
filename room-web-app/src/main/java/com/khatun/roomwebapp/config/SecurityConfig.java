package com.khatun.roomwebapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/", "/api/*", "/api/rest/*").permitAll() // permit all URLs that match these patterns to bypass authentication
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll() //redirect the browser to "login.html" page by allow browser to send "/login" request to AuthenticateController
                .and()
                .logout().permitAll();
    }

    @Autowired
    public void ConfigureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        // for demo only as NoOpPasswordEncoder is deprecated
        auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
                .withUser("user").password("password").roles("USER");
    }
}
