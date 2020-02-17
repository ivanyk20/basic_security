package com.example.again_security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                .antMatchers("/product/save").hasAnyRole("ADMIN")
                .antMatchers("/product/products").hasAnyRole("USER", "ADMIN")
                .antMatchers("/product/**").hasRole("ADMIN")
                .and()
                .httpBasic();
    }
}
