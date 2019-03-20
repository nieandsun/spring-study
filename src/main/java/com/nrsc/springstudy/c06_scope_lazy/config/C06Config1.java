package com.nrsc.springstudy.c06_scope_lazy.config;

import com.nrsc.springstudy.c06_scope_lazy.bean.Cup06;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class C06Config1 {
    /**
     * 没有@Scope/有@Scope后面什么都不写/或 @Scope("singleton"):
     *    单实例(默认)---IOC容器启动的时候会调用方法创建对象并放到IOC容器中,
     *    以后每次获取的就是直接从容器中拿(大Map.get)的同一个bean
     *
     * prototype:
     *     多实例---IOC容器启动的时候,IOC容器启动并不会去调用方法创建对象,
     *     而是每次获取的时候才会调用方法创建对象
     *
     *
     * request: 主要针对web应用, 递交一次请求创建一个实例
     *
     * session:同一个session创建一个实例
     *
     * @return
     */
    @Bean
    // @Scope(value = "singleton") //这样也可以
    @Scope("singleton")
    public Cup06 cup06() {
        return new Cup06();
    }
}
