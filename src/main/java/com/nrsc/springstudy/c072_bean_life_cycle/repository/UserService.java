package com.nrsc.springstudy.c072_bean_life_cycle.repository;

import com.nrsc.springstudy.c072_bean_life_cycle.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/***
 * @author : Sun Chuan
 * @date : 2019/11/19 16:52
 * Description: 
 */
//@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void whichRepository() {
        System.err.println("test05Repository02====>" + userRepository);
    }
}
