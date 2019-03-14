package com.nrsc.springstudy.c3_factorybean.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig1 {
    @Bean
    public MyFactoryBean myFactoryBean() {
        return new MyFactoryBean();
    }
}
