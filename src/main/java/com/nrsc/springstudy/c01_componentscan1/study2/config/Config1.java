package com.nrsc.springstudy.c01_componentscan1.study2.config;


import com.nrsc.springstudy.c01_componentscan1.study2.config1_test.OrderRepository1;
import com.nrsc.springstudy.c01_componentscan1.study2.config1_test.SellComponent1;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(value = "com.nrsc.springstudy.c01_componentscan1.study2.config1_test",
        excludeFilters = {
                @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {OrderRepository1.class, SellComponent1.class}),
                @Filter(type = FilterType.ANNOTATION, classes = {Service.class}),
                @Filter(type = FilterType.CUSTOM, classes = {NrscTypeFilter.class})})
public class Config1 {
}
