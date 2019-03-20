package com.nrsc.springstudy.c06_scope_lazy.config;

import com.nrsc.springstudy.c06_scope_lazy.bean.Cup06;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class C06Config2 {
    /**
     *  非懒加载: 主要针对单实例bean,默认在容器启动的时候创建对象
     *
     * 	懒加载:容器启动时候不创建对象, 仅当第一次使用(获取)bean的时候才创建被初始化
     * 	       之后就和其他单实例bean一样直接去spring容器中去拿了
     * @return
     */
    @Bean
    //@Lazy(value = false)
    @Lazy(false)
    //@Lazy
    public Cup06 cup06() {
        System.out.println("向spring容器中添加cup06类");
        return new Cup06();
    }
}
