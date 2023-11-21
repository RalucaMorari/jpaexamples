package com.springapps.jpaexamples.MoviesApp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FranchisesConfig {
    @Bean
    public Franchises createFranchises(){
        return new Franchises("Marvel");
    }
}
