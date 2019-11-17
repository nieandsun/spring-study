package com.nrsc.springstudy.c08_Conditional.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author : Sun Chuan
 * @date : 2019/11/17 22:51
 * Description： 该类作为bean的注册条件类，需要实现Condition接口，并实现其matches方法
 */
public class WinCondition implements Condition {

    /***
     *
     * @param context 判断条件能使用的上下文（环境）
     * @param metadata 注释信息
     * @return
     */
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //通过context可以拿到很多信息，如：

//        //可以获取到IOC容器使用的beanFactory
//        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
//        //可以获取到类加载器
//        ClassLoader classLoader = context.getClassLoader();
//        //获取bean定义的注册类
//        BeanDefinitionRegistry registry = context.getRegistry();
//        //获取资源加载器
//        ResourceLoader resourceLoader = context.getResourceLoader();

        //todo 如果运行环境为win则返回true
        //获取当前环境信息
        Environment environment = context.getEnvironment();
        //获取当前运行环境的系统名称
        String property = environment.getProperty("os.name");
        if (property.contains("Windows")) {
            return true;
        }
        return false;
    }
}
