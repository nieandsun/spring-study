package com.nrsc.springstudy.c11_Transaction.service.impl;

import com.nrsc.springstudy.c11_Transaction.dao.SalaryDao;
import com.nrsc.springstudy.c11_Transaction.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/***
 * @author : Sun Chuan
 * @date : 2019/12/18 15:10
 * Description: 
 */
@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private SalaryDao salaryDao;

    @Transactional(propagation = Propagation.NESTED, rollbackFor = Exception.class)
    @Override
    public void addSalaryInfo(String account, BigDecimal salary) {
        salaryDao.addSalaryInfo(account, salary);
        //int i = 1 / 0;
    }
}
