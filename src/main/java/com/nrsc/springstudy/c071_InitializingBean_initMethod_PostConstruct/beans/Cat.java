package com.nrsc.springstudy.c071_InitializingBean_initMethod_PostConstruct.beans;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

/**
 * Created By: Sun Chuan
 * Created Date: 2019/7/7 22:19
 */
public class Cat implements InitializingBean {
    private String name;

    //构造方法-----创建对象时调用
    public Cat() {
        System.out.println("Cat......constructor............");
    }

    //设置name属性时会调用
    public void setName(String name) {
        System.out.println("===cat=========setName========");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //在配置类中利用注解将initMethod指向下面的init方法----对应于initMethod的用法
    public void init() {
        System.out.println("Cat......init............");
    }

    //继承了InitializingBean接口，需要实现afterPropertiesSet方法---对应于InitializingBean的用法
    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat......afterPropertiesSet............");
    }
    @PostConstruct
    public void  init2(){
        System.out.println("Cat......@PostConstruct............");
    }
}
