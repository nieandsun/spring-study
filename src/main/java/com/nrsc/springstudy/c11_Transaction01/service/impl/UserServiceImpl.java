package com.nrsc.springstudy.c11_Transaction01.service.impl;


import com.nrsc.springstudy.c11_Transaction01.dao.UserDao;
import com.nrsc.springstudy.c11_Transaction01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
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
    private JdbcTemplate jdbcTemplate;


    @Autowired
    private UserDao userServiceDao;


    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addUserAndSalary(String username, BigDecimal salary) {
        //按照生日等生成一个14位的员工编号
        String account = "20191218000001";

        //往员工表里插入该用户的用户信息
        userServiceDao.saveUserInfo(username, account);

        //int i = 1 / 0;
    }
}
