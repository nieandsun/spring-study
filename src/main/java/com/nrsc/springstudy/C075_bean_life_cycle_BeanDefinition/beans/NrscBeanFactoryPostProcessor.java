package com.nrsc.springstudy.C075_bean_life_cycle_BeanDefinition.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/***
 * @author : Sun Chuan
 * @date : 2019/12/29
 * Description：
 */
@Component
public class NrscBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        //GenericBeanDefinition instABeanDefinition =
        //        (GenericBeanDefinition)beanFactory.getBeanDefinition("instA");
        //class属性：用来控制Bean实例化到底实例化成哪种类型的对象。
        //instABeanDefinition.setBeanClass(InstC.class);

        //autowireMode属性：控制Bean属性的注入方式
        //instABeanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_NAME);
        //instABeanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
        //instABeanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_CONSTRUCTOR);

        GenericBeanDefinition instDBeanDefinition =
                (GenericBeanDefinition)beanFactory.getBeanDefinition("instD");
        ConstructorArgumentValues constructorArgumentValues = new ConstructorArgumentValues();
        //表示构造函数的第一个参数的类型为12的类型 ---> 即int型 ---》spring会进行类型推断
        constructorArgumentValues.addIndexedArgumentValue(0,12);
        //表示构造函数的第二个参数的类型为"haha"的类型 ---> 即String类型
        constructorArgumentValues.addIndexedArgumentValue(1,"haha");
        //将instD的定义对象的constructorArgumentValues属性设置为自己定义的类型
        instDBeanDefinition.setConstructorArgumentValues(constructorArgumentValues);


    }
}
