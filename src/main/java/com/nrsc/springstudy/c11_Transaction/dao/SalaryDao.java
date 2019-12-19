package com.nrsc.springstudy.c11_Transaction.dao;

import java.math.BigDecimal;

/***
 * @author : Sun Chuan
 * @date : 2019/12/18 15:08
 * Description: 
 */
public interface SalaryDao {
    void addSalaryInfo(String account, BigDecimal salary);
}
