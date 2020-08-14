package com.hc.config;

import com.hc.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    public User getUser(){
        return new User();
    }
}
