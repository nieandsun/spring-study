package com.nrsc.springstudy.c10_AOP.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/***
 * @author : Sun Chuan
 * @date : 2019/11/24 19:44
 * Description：
 */

@Configuration
@ComponentScan(value = "com.nrsc.springstudy.c10_AOP")
@EnableAspectJAutoProxy //开启AOP注解功能
public class C10Config {

}
