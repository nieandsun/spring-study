package com.nrsc.springstudy.c11_Transaction.service;

import java.math.BigDecimal;

/***
 * @author : Sun Chuan
 * @date : 2019/12/18 15:08
 * Description: 
 */
public interface UserService {
    void addUserAndSalary(String username, BigDecimal salary);
}
