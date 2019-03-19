package com.nrsc.springstudy.c05_Autowired_Resource_Inject.test02.repository.impl;

import com.nrsc.springstudy.c05_Autowired_Resource_Inject.test02.repository.Test05Repository02;
import org.springframework.stereotype.Repository;

@Repository
//@Primary
public class Test05Repository02_1 implements Test05Repository02 {
    private String flag = "1";

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Test05Repository02_1{" +
                "flag='" + flag + '\'' +
                '}';
    }
}
