package com.nrsc.springstudy.c11_Transaction01.dao.impl;

import com.nrsc.springstudy.c11_Transaction01.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl2 implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate2;

    @Override
    public void saveUserInfo(String username, String account) {
        String sql = "insert into `t_user` (username,account) values(?,?)";
        jdbcTemplate2.update(sql, username, account);
    }
}
