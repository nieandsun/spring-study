package com.nrsc.springstudy.C04_setAllowBeanDefinitionOverriding.test01;
import org.springframework.stereotype.Repository;
@Repository
public class Test04Repository {
    private String  flag = "1";
    public String getFlag() {
        return flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Test04Repository{" +
                "flag='" + flag + '\'' +
                '}';
    }
}
