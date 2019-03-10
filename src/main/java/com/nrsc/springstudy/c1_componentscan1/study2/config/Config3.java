package com.nrsc.springstudy.c1_componentscan1.study2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(value = "com.nrsc.springstudy.c1_componentscan1.study2.config2_test",
        includeFilters = {
                @Filter(type = FilterType.ANNOTATION, classes = {Component.class})},
        useDefaultFilters = false)
public class Config3 {
}
