package com.nrsc.springstudy.c11_Transaction01.dao.impl;

import com.nrsc.springstudy.c11_Transaction01.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/***
 * @author : Sun Chuan
 * @date : 2019/12/18 15:09
 * Description: 
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void saveUserInfo(String username, String account) {
        String sql = "insert into `t_user` (username,account) values(?,?)";
        jdbcTemplate.update(sql, username, account);
    }
}
