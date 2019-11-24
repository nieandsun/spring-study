package com.nrsc.springstudy.c09_Value.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author : Sun Chuan
 * @date : 2019/11/24 19:43
 * Description：
 */
@Getter
@Setter
@ToString
public class Dog {
    @Value("大黄")
    private String name;

    @Value("#{20-2}")  //SpringEl表达式
    private Integer age;

    private String color;
}
