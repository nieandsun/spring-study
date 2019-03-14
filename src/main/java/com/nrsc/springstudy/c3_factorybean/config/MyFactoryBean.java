package com.nrsc.springstudy.c3_factorybean.config;

import com.nrsc.springstudy.c2_import.bean.Dog;
import com.nrsc.springstudy.c3_factorybean.bean.Apple;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Apple> {
    /**
     * 返回泛型类(这里指Apple类)的实例
     * @return
     * @throws Exception
     */
    public Apple getObject() throws Exception {
        return new Apple("红富士", 10);
    }

    /**
     * 返回泛型类的类型
     * @return
     */
    public Class<?> getObjectType() {
        return Dog.class;
    }

    /**
     * 指定是否为多例
     * @return
     */
    public boolean isSingleton() {
        return true;
    }
}
