package com.nrsc.springstudy.C075_bean_life_cycle_BeanDefinition.beans;

import org.springframework.stereotype.Component;

/***
 * @author : Sun Chuan
 * @date : 2019/12/29
 * Description：
 */
@Component
public class InstA {

    //@Autowired
    private InstB instB;

    public InstA() {
        System.out.println("InstA的无参构造方法");
    }

    public InstA(InstB instB) {
        this.instB = instB;
        System.out.println("InstA通过构造函数注入InstB");
    }


    public InstB getInstB() {
        return instB;
    }

    public void setInstB(InstB instB) {
        this.instB = instB;
    }

    @Override
    public String toString() {
        return "InstA{instB=" + instB + "}";
    }
}
