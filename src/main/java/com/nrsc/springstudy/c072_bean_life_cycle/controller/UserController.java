package com.nrsc.springstudy.c072_bean_life_cycle.controller;

import com.nrsc.springstudy.c072_bean_life_cycle.repository.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/***
 * @author : Sun Chuan
 * @date : 2019/11/19 16:51
 * Description: 
 */
//@Controller
public class UserController {

    @Autowired
    private UserService userService;
}
