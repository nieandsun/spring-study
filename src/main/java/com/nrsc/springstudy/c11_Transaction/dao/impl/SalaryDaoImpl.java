package com.nrsc.springstudy.c11_Transaction.dao.impl;

import com.nrsc.springstudy.c11_Transaction.dao.SalaryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/***
 * @author : Sun Chuan
 * @date : 2019/12/18 15:09
 * Description: 
 */
@Repository
public class SalaryDaoImpl implements SalaryDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addSalaryInfo(String account, BigDecimal salary) {
        String sql = "insert into `t_salary` (account,salary) values(?,?)";
        jdbcTemplate.update(sql, account, salary);
    }
}
