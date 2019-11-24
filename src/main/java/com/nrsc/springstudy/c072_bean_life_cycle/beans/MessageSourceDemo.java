package com.nrsc.springstudy.c072_bean_life_cycle.beans;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * @author : Sun Chuan
 * @date : 2019/11/24 11:13
 * Description：
 */
@Component
public class MessageSourceDemo implements MessageSourceAware {
    public void setMessageSource(MessageSource messageSource) {
        String aaa = messageSource.getMessage("hello", null, Locale.getDefault());
        String bbb = messageSource.getMessage("hello", null, Locale.CHINA);
        String ccc = messageSource.getMessage("hello", null, Locale.US);
        System.err.println(aaa);
        System.err.println(bbb);
        System.err.println(ccc);
    }
}
