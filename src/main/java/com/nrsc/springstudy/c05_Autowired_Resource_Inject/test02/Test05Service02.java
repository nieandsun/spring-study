package com.nrsc.springstudy.c05_Autowired_Resource_Inject.test02;

import com.nrsc.springstudy.c05_Autowired_Resource_Inject.test02.repository.Test05Repository02;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class Test05Service02 {

    @Inject
    private Test05Repository02 test05Repository02_1;

    public void whichRepository() {
        System.err.println("test05Repository02====>" + test05Repository02_1);
    }
}
