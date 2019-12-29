package com.nrsc.springstudy.C075_bean_life_cycle_BeanDefinition.beans;

import org.springframework.stereotype.Component;

/***
 * @author : Sun Chuan
 * @date : 2019/12/29
 * Description：
 */
@Component
public class InstD {

    private String username;

    private Integer age;

    public InstD() {
        System.out.println("调用D的无参构造创建D对象");
    }

    public InstD(String username) {
        this.username = username;
        System.out.println("调用D的有参构造创建D对象====username");
    }

    public InstD(Integer age) {
        this.age = age;
        System.out.println("调用D的有参构造创建D对象====age");
    }

    public InstD(String username, Integer age) {
        this.username = username;
        this.age = age;
        System.out.println("调用D的有参构造创建D对象====username+age");
    }

    public InstD(Integer age, String username) {
        this.age = age;
        this.username = username;
        System.out.println("调用D的有参构造创建D对象====age+username");
    }
}
