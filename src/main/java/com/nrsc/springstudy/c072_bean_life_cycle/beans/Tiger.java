package com.nrsc.springstudy.c072_bean_life_cycle.beans;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/***
 * @author : Sun Chuan
 * @date : 2019/11/21 15:35
 * Description:
 *    实现了BeanNameAware，可以获取到当前bean在IOC容器中的名字
 *    注意该Aware的调用在前置处理器applyBeanPostProcessorsBeforeInitialization方法之前
 *
 *    实现了EmbeddedValueResolverAware，可以利用resolver来解析字符串表达式（el表达式）
 */
@Component
public class Tiger implements BeanNameAware, EmbeddedValueResolverAware {
    private String name = "老虎";

    public void setBeanName(String name) {
        System.err.println("当前bean的名字为:" + name);
    }

    public void setEmbeddedValueResolver(StringValueResolver resolver) {

        String val = resolver.resolveStringValue("当前系统为${os.name},表达式3*8的结果为：#{3*8}");
        System.err.println("解析后的字符串为===" + val);
    }
}
