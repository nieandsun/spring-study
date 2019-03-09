package com.nrsc.springstudy.c1_componentscan.config;

import com.nrsc.springstudy.c1_componentscan.config5_test.OrderRepository5;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//扫描除了OrderRepository5类之外的config3_test目录
@ComponentScan(value = "com.nrsc.springstudy.c1_componentscan.config5_test",
        excludeFilters = {@Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {OrderRepository5.class})})
public class Config5 {

}
