package com.nrsc.springstudy.c072_bean_life_cycle.service;

/***
 * @author : Sun Chuan
 * @date : 2019/11/19 16:53
 * Description: 
 */
//@Repository
public class UserRepository {

    private String flag = "1";

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "UserRepository{" +
                "flag='" + flag + '\'' +
                '}';
    }
}
