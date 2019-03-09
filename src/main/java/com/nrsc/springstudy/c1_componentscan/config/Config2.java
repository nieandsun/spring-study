package com.nrsc.springstudy.c1_componentscan.config;

import com.nrsc.springstudy.c1_componentscan.config2_test.OrderRepository2;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @Configuration标识此类为注解类
 */
@Configuration
/**
 * 扫描config2_test目录，并排除OrderRepository2类
 */
@ComponentScan(value = "com.nrsc.springstudy.c1_componentscan.config2_test",
        excludeFilters = {@Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {OrderRepository2.class})})
public class Config2 {
}
