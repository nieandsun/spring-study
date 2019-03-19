package com.nrsc.springstudy.c05_Autowired_Resource_Inject.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.nrsc.springstudy.c05_Autowired_Resource_Inject.test02")
public class C05DemoConfig02 {

//    @Bean
//    public DemoRepository demoRepository() {
//        DemoRepository demoRepository = new DemoRepository();
//        demoRepository.setFlag("2");
//        return demoRepository;
//    }
}
