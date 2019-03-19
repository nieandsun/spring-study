package com.nrsc.springstudy.c05_Autowired_Resource_Inject.test01;

import org.springframework.stereotype.Repository;

@Repository
public class Test05Repository01 {
    private String  flag = "1";

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Test05Repository01{" +
                "flag='" + flag + '\'' +
                '}';
    }
}
