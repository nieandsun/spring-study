package com.nrsc.springstudy.c11_Transaction.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/***
 * @author : Sun Chuan
 * @date : 2019/11/24 19:44
 * Description：
 */

@Configuration
@ComponentScan(value = "com.nrsc.springstudy.c11_Transaction")
@EnableTransactionManagement //开启事务注解功能
public class C11Config {

    //创建数据源
    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        //这个c3p0封装了JDBC, dataSource接口的实现
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/nrsc-transaction?characterEncoding=utf-8&serverTimezone=GMT&useSSL=false");
        return dataSource;
    }

    //jdbcTemplate能简化增删改查的操作
    @Bean
    public JdbcTemplate jdbcTemplate() throws PropertyVetoException{
        return new JdbcTemplate(dataSource());
    }
    //注册事务管理器
    @Bean
    public PlatformTransactionManager platformTransactionManager() throws PropertyVetoException{
        return new DataSourceTransactionManager(dataSource());
    }

}
