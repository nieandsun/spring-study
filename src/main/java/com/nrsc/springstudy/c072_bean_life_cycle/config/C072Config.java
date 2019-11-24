package com.nrsc.springstudy.c072_bean_life_cycle.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan(value = "com.nrsc.springstudy.c072_bean_life_cycle")
public class C072Config {


//    @Bean(name = "cat" ,initMethod = "init")
////    public Cat buildCat() {
////        Cat cat = new Cat();
////        cat.setName("花花");
////        return cat;
////    }

    /***
     * 向IOC容器中注入ResourceBundleMessageSource
     * 该类用来确定properties的位置、设置编码格式等
     * 注意 ： spring规定这个bean的name必须叫----> messageSource
     *
     * @return
     */
    @Bean(value = "messageSource")
    public ResourceBundleMessageSource resourceBundleMessageSource() {
        ResourceBundleMessageSource resourceBundleMessageSource = new ResourceBundleMessageSource();
        //设置properties的路径---注意最后一个messages不能少，它指的是properties文件的前缀
        resourceBundleMessageSource.setBasename("i18/messages/messages");
        resourceBundleMessageSource.setDefaultEncoding("utf-8");
        return resourceBundleMessageSource;
    }
}
