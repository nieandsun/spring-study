package com.nrsc.springstudy.c09_Value.config;

import com.nrsc.springstudy.c09_Value.beans.Cup;
import com.nrsc.springstudy.c09_Value.beans.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author : Sun Chuan
 * @date : 2019/11/24 19:44
 * Description：
 */
@PropertySource(value = {"classpath:/Test09Value.properties"}) //读取配置文件
@Configuration
public class C09Config {
    @Bean
    public Dog dog() {
        return new Dog();
    }

    @Bean
    public Cup cup() {
        return new Cup();
    }

}
