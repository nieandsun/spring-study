package com.nrsc.springstudy.c11_Transaction01.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/***
 * @author : Sun Chuan
 * @date : 2019/11/24 19:44
 * Description：
 */

@Configuration
@ComponentScan(value = "com.nrsc.springstudy.c11_Transaction01")
@EnableTransactionManagement //开启事务注解功能
@EnableAspectJAutoProxy(exposeProxy = true)
public class C11Config01 {
    //--------------------------------数据源1--------------------------------------------
    //创建数据源
    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/nrsc-transaction?characterEncoding=utf-8&serverTimezone=GMT&useSSL=false");
        return dataSource;
    }

    //注册事务管理器
    @Bean("platformTransactionManager")
    public PlatformTransactionManager platformTransactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    //使用jdbcTemplate持久层框架~~~之后整理Mybatis的时候这里会换成Mybatis
    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    //--------------------------------数据源2--------------------------------------------
    //创建数据源
    @Bean
    public DataSource dataSource2() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/nrsc-transaction2?characterEncoding=utf-8&serverTimezone=GMT&useSSL=false");
        return dataSource;
    }

    //注册事务管理器
    @Bean("platformTransactionManager")
    public PlatformTransactionManager platformTransactionManager2() {
        return new DataSourceTransactionManager(dataSource2());
    }

    //使用jdbcTemplate持久层框架~~~之后整理Mybatis的时候这里会换成Mybatis
    @Bean
    public JdbcTemplate jdbcTemplate2() {
        return new JdbcTemplate(dataSource2());
    }
}
