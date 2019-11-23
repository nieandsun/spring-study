package com.nrsc.springstudy.c072_bean_life_cycle.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author : Sun Chuan
 * @date : 2019/11/23 16:02
 * Description：
 */
@Component
public class NrscBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.err.println("自定义后置处理器（前）---当前bean为:" + bean + ",beanName为:" + beanName);
        //返回处理后的bean --> 接下来该bean才能被注入到IOC容器
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.err.println("自定义后置处理器（后）---当前bean为:" + bean + ",beanName为:" + beanName);
        return bean;
    }
}
