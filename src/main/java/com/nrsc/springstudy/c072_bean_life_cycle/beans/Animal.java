package com.nrsc.springstudy.c072_bean_life_cycle.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/***
 * @author : Sun Chuan
 * @date : 2019/11/19 16:03
 * Description: 
 */
@Component
public class Animal {

    @Autowired
    private Cat cat;



}
