package com.nrsc.springstudy.c11_Transaction01.service;

import java.math.BigDecimal;

/***
 * @author : Sun Chuan
 * @date : 2019/12/18 15:08
 * Description: 
 */
public interface UserService {
    void addUserAndSalary(String username, BigDecimal salary);

    void addSalary(String account,BigDecimal salary);
}
