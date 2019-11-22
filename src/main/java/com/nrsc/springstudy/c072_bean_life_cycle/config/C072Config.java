package com.nrsc.springstudy.c072_bean_life_cycle.config;


import com.nrsc.springstudy.c072_bean_life_cycle.beans.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.nrsc.springstudy.c072_bean_life_cycle")
public class C072Config {

    @Bean(name = "cat" ,initMethod = "init")
    public Cat buildCat() {
        Cat cat = new Cat();
        cat.setName("花花");
        return cat;
    }


}
