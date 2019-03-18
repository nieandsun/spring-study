package com.nrsc.springstudy.C04_setAllowBeanDefinitionOverriding.test01;

//@Repository(value ="test04Repository" )
public class  Test04Repository2 {
    private String  flag = "1";

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Test04Repository2{" +
                "flag='" + flag + '\'' +
                '}';
    }
}
