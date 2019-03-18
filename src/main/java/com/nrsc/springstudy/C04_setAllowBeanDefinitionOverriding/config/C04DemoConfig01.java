package com.nrsc.springstudy.C04_setAllowBeanDefinitionOverriding.config;
import com.nrsc.springstudy.C04_setAllowBeanDefinitionOverriding.test01.Test04Repository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.nrsc.springstudy.C04_setAllowBeanDefinitionOverriding.test01")
public class C04DemoConfig01 {
    @Bean
    public Test04Repository test04Repository() {
        Test04Repository test04Repository = new Test04Repository();
        test04Repository.setFlag("2");
        return test04Repository;
    }
}
