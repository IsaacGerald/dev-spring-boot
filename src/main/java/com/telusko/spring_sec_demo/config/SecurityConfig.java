package com.telusko.spring_sec_demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        //Disabling the csrf
        http.csrf(AbstractHttpConfigurer::disable);
        //Enable username and password
        http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
        //Provide a form for username and password (can disable if session is stateless)
        //http.formLogin(Customizer.withDefaults());
        //User basic auth for security
        http.httpBasic(Customizer.withDefaults());
        //Make session stateless (Change after every request)
        http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));



        return http.build();
    }
}
