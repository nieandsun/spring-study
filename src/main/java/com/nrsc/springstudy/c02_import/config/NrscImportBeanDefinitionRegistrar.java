package com.nrsc.springstudy.c02_import.config;

import com.nrsc.springstudy.c02_import.bean.Pig;
import com.nrsc.springstudy.c02_import.bean.Sheep;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class NrscImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     * 该类需要实现的方法就一个
     * @param importingClassMetadata 当前类的注解信息
     * @param registry 可以把要加入到Spring容器中的类加入进去
     */
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //查看Elephant类是否被定义---也可以理解为查看Elephant是否注册到spring容器中
        boolean bean1 = registry.containsBeanDefinition("com.nrsc.springstudy.c02_import.bean.Elephant");
        boolean bean2 = registry.containsBeanDefinition("com.nrsc.springstudy.c02_import.bean.Rabbit");

        //如果Elephant注册了,则注册Pig类到Sping容器------>pig应该可以被注册到spring容器
        if(bean1){
            //可以自己指定注入到Spring容器中的key值为pig
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Pig.class);
            registry.registerBeanDefinition("pig", beanDefinition);
        }

        //如果Rabbit注册了,则注册Sheep类到Sping容器------>Sheep应该可以被注册到spring容器
        if(bean2){
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Sheep.class);
            registry.registerBeanDefinition("sheep", beanDefinition);
        }
    }
}
