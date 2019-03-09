package com.nrsc.springstudy.c1_componentscan.config;

import com.nrsc.springstudy.c1_componentscan.config3_test.OrderRepository3;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * 直接将多个@ComponentScan写在一起，某些IDEA版本上可能会报错
 */
@Configuration
//扫描整个config3_test目录
@ComponentScan(value = "com.nrsc.springstudy.c1_componentscan.config3_test")
//扫描除了OrderRepository3类之外的config3_test目录
@ComponentScan(value = "com.nrsc.springstudy.c1_componentscan.config3_test",
        excludeFilters = {@Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {OrderRepository3.class})})
public class Config3 {
}
