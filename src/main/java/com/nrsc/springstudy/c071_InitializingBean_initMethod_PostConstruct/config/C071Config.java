package com.nrsc.springstudy.c071_InitializingBean_initMethod_PostConstruct.config;

import com.nrsc.springstudy.c071_InitializingBean_initMethod_PostConstruct.beans.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class C071Config {

    @Bean(initMethod = "init")
    public Cat buildCat() {
        Cat cat = new Cat();
        cat.setName("花花");
        return cat;
    }
}
