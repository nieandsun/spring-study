package com.nrsc.springstudy.c10_AOP.service;

import org.springframework.stereotype.Service;

/***
 *  @author : Sun Chuan
 *  @date : 2019/12/1 15:56
 *  Description：
 */
@Service
public class Calculator {
    //业务方法
    public int div(int i, int j) {
        System.err.println("==开始进入div方法===");
        return i / j;
    }
}
