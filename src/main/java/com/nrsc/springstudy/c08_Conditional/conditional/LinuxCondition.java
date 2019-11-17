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
public class LinuxCondition implements Condition {

    /***
     *
     * @param context 判断条件能使用的上下文（环境）
     * @param metadata 注释信息
     * @return
     */
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        //todo 如果运行环境为linux则返回true
        //获取当前环境信息
        Environment environment = context.getEnvironment();
        //获取当前运行环境的系统名称
        String property = environment.getProperty("os.name");
        if (property.contains("linux")) {
            return true;
        }
        return false;
    }
}
