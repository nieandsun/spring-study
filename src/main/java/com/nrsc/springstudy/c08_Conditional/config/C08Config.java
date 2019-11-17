package com.nrsc.springstudy.c08_Conditional.config;

import com.nrsc.springstudy.c08_Conditional.conditional.LinuxCondition;
import com.nrsc.springstudy.c08_Conditional.conditional.WinCondition;
import com.nrsc.springstudy.domain.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Sun Chuan
 * @date : 2019/11/17 22:49
 * Description：
 */
@Configuration
public class C08Config {
    /***
     * 注册xiaoming的注册条件使用WinCondition.class
     * @return
     */
    @Conditional(WinCondition.class)
    @Bean("xiaoming")
    public Student student1() {
        System.out.println("给容器中添加小明同学。。。win");
        return new Student("xiaoming", 10);
    }
    /***
     * 注册xiaohong的注册条件使用WLinuxCondition.class
     * @return
     */
    @Conditional(LinuxCondition.class)
    @Bean("xiaohong")
    public Student student2() {
        System.out.println("给容器中添加小红同学。。。lin");
        return new Student("xiaohong", 9);
    }
}
