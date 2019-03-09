package com.nrsc.springstudy.c1_componentscan.config2_test;

import com.nrsc.springstudy.domain.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.nrsc.springstudy.c1_componentscan.config1_test")
public class Config1 {
    @Bean
    public Student student() {
        return new Student("yoyo", 18);
    }
}
