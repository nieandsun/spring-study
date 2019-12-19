package com.nrsc.springstudy.c11_Transaction.service;

import java.math.BigDecimal;

/***
 * @author : Sun Chuan
 * @date : 2019/12/18 15:10
 * Description: 
 */
public interface SalaryService {
    void addSalaryInfo(String account, BigDecimal salary);
}
