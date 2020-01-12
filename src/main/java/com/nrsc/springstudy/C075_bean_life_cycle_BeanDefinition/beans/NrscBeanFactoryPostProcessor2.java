package com.nrsc.springstudy.C075_bean_life_cycle_BeanDefinition.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/***
 * @author : Sun Chuan
 * @date : 2020/1/12
 * Description : 测试ConstructorArgumentValues的addGenericArgumentValue方法
 */
@Component
public class NrscBeanFactoryPostProcessor2 implements BeanFactoryPostProcessor {


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        GenericBeanDefinition instEBeanDefinition =
                (GenericBeanDefinition) beanFactory.getBeanDefinition("instE");

        ConstructorArgumentValues constructorArgumentValues = new ConstructorArgumentValues();
        //addGenericArgumentValue方法会在实例化当前BeanDefinition对象对应的bean时，给其属性赋值
        constructorArgumentValues.addGenericArgumentValue("com.nrsc.springstudy.C075_bean_life_cycle_BeanDefinition.beans.InstB");

        instEBeanDefinition.setConstructorArgumentValues(constructorArgumentValues);
    }
}
