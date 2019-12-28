package com.nrsc.springstudy.c11_Transaction01.service.impl;


import com.nrsc.springstudy.c11_Transaction01.dao.SalaryDao;
import com.nrsc.springstudy.c11_Transaction01.dao.UserDao;
import com.nrsc.springstudy.c11_Transaction01.service.UserService;
import org.springframework.aop.framework.AopContext;
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
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDaoImpl;

    @Autowired
    private SalaryDao salaryDao;

    /***
     * 插入用户信息和该用户的薪资信息
     * @param username
     * @param salary
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addUserAndSalary(String username, BigDecimal salary) {
        //按照生日等生成一个14位的员工编号
        String account = "20191218000001";

        //往员工表里插入该用户的用户信息
        userDaoImpl.saveUserInfo(username, account);

        //((UserService)AopContext.currentProxy()).addSalary(account,salary);
        addSalary(account,salary);
        int i = 1 / 0;
    }


    /***
     * 插入用户的薪资信息
     * @param account
     * @param salary
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public void addSalary(String account, BigDecimal salary) {
        salaryDao.addSalaryInfo(account, salary);

    }


}
