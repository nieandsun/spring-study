package com.nrsc.springstudy.c03_factorybean.bean;

import com.nrsc.springstudy.c02_import.bean.Dog;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyFactoryBean2 implements FactoryBean<Apple> {
    public Apple getObject() throws Exception {
        return new Apple("红富士", 10);
    }

    public Class<?> getObjectType() {
        return Dog.class;
    }

    public boolean isSingleton() {
        return true;
    }
}
