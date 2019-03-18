package com.nrsc.springstudy.C04_setAllowBeanDefinitionOverriding.test01;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service
public class Test04Service {
    @Resource
    private Test04Repository test04Repository;
    public void whichRepository() {
        System.err.println("test04Repository====>" + test04Repository);
    }
}
