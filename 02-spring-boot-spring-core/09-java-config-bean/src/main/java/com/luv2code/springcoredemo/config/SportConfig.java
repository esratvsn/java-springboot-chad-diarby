package com.luv2code.springcoredemo.config;

import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach(){ //bean kimligi default olarak method adıdır yani swimCoach denetleyiciye enjekte ederken bunu kullan
         return new SwimCoach();
    }
}
