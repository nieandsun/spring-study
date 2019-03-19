package com.nrsc.springstudy.c05_Autowired_Resource_Inject.test01;

import org.springframework.stereotype.Component;

@Component("aaa")
public class AAA {

    private String flag="aaa";

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "AAA{" +
                "flag='" + flag + '\'' +
                '}';
    }
}
