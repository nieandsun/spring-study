package com.nrsc.springstudy.c074DisposableBean_destroyMothod_PreDestroy.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created By: Sun Chuan
 * Created Date: 2019/7/7 22:19
 */
public class Monkey implements InitializingBean, DisposableBean {
    private String name;

    /***
     * 构造方法-----创建对象时调用
     */
    public Monkey() {
        System.out.println("monkey......constructor............");
    }

    /***
     * 设置name属性时会调用
     * @param name
     */
    public void setName(String name) {
        System.out.println("===monkey=========setName========");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /***
     * 在配置类中利用注解将initMethod指向下面的init方法----对应于initMethod的用法
     */
    public void init() {
        System.out.println("monkey......init............");
    }

    /***
     * 在配置类中利用注解将destroyMethod指向下面的destroy方法----对应于destroyMethod的用法
     */
    public void destroyMethod() {
        System.err.println("monkey....destroyMethod.....");
    }


    /***
     * 继承了InitializingBean接口，需要实现afterPropertiesSet方法---对应于InitializingBean的用法
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("monkey......afterPropertiesSet............");
    }

    /***
     * 继承了DisposableBean接口，需要实现destroy方法---对应于DisposableBean的用法
     */
    @Override
    public void destroy() throws Exception {
        System.err.println("monkey......DisposableBean............");
    }

    @PostConstruct
    public void init2() {
        System.out.println("monkey......@PostConstruct............");
    }

    @PreDestroy
    public void destroy2() {
        System.err.println("monkey......@PreDestroy............");
    }
}
