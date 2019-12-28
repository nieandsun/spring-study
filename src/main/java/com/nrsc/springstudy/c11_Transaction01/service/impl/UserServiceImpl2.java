package com.nrsc.springstudy.c11_Transaction01.service.impl;

import com.nrsc.springstudy.c11_Transaction01.service.UserService;
import com.nrsc.springstudy.c11_Transaction01.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class UserServiceImpl2 implements UserService {



    @Autowired
    private UserDao userDaoImpl2;


    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addUserAndSalary(String username, BigDecimal salary) {
        //按照生日等生成一个14位的员工编号
        String account = "20191218000001";

        //往员工表里插入该用户的用户信息
        userDaoImpl2.saveUserInfo(username, account);

    }

    @Override
    public void addSalary(String account, BigDecimal salary) {

    }
}
