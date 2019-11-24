package com.nrsc.springstudy.c09_Value.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author : Sun Chuan
 * @date : 2019/11/24 19:56
 * Description：
 */
@Setter
@Getter
@ToString
public class Cup {
    /***
     * 直接从配置文件里读取配置内容赋值给当前属性
     */
    @Value("${cup.name}")
    private String name;

    /***
     * 通过SpringEl表达式获取dog的age值赋值给当前属性
     */
    @Value("#{dog.age}")
    private Integer size;

    /***
     * 通过SpringEl表达式获取dog的color值赋值给当前属性,如果color的值为空，则将white赋值给当前属性
     */
    @Value("#{dog.color?:'white'}")
    private String color;
}
