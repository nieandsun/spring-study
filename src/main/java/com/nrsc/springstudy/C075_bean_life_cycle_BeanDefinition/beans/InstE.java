package com.nrsc.springstudy.C075_bean_life_cycle_BeanDefinition.beans;

import org.springframework.stereotype.Component;

/***
 * @author : Sun Chuan
 * @date : 2020/1/12
 * Description :
 */
@Component
public class InstE {

    private Class aaa;

    public InstE(Class aaa) {
        System.err.println("==InstE调用有参构造==" + aaa);
    }
}
