package com.nrsc.springstudy.c05_Autowired_Resource_Inject.test01;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

@Service
public class Test05Service01 {

    @Inject
    @Resource
    private Test05Repository01 test05Repository0000;

    public void whichRepository() {
        System.err.println("test05Repository====>" + test05Repository0000);
    }
}
