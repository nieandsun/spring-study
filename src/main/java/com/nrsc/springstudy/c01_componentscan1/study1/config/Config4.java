package com.nrsc.springstudy.c01_componentscan1.study1.config;

import com.nrsc.springstudy.c01_componentscan1.study1.config4_test.OrderRepository4;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScans(value = {
        @ComponentScan(value = "com.nrsc.springstudy.c01_componentscan1.study1.config4_test"),
        @ComponentScan(value = "com.nrsc.springstudy.c01_componentscan1.study1.config4_test",
                excludeFilters = {@Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {OrderRepository4.class})})
})

public class Config4 {

}
