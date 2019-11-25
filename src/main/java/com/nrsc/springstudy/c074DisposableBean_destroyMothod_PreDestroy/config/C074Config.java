package com.nrsc.springstudy.c074DisposableBean_destroyMothod_PreDestroy.config;


import com.nrsc.springstudy.c074DisposableBean_destroyMothod_PreDestroy.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class C074Config {

    /***
     * 单实例非懒加载的bean
     * @return
     */
    @Bean(initMethod = "init", destroyMethod = "destroyMethod")
    public Cat buildCat() {
        Cat cat = new Cat();
        cat.setName("花花");
        return cat;
    }

    /****
     * 单实例且懒加载的bean --- 使用
     * @return
     */
    @Lazy
    @Bean(initMethod = "init", destroyMethod = "destroyMethod")
    public Duck duck() {
        Duck duck = new Duck();
        duck.setName("小黄鸭");
        return duck;
    }

    /***
     * 单实例且懒加载的bean --- 不使用
     * @return
     */
    @Lazy
    @Bean(initMethod = "init", destroyMethod = "destroyMethod")
    public Monkey monkey() {
        Monkey monkey = new Monkey();
        monkey.setName("小黄鸭");
        return monkey;
    }

    /***
     * 多实例bean --- 但不使用
     * @return
     */
    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "destroyMethod")
    public Dog dog() {
        Dog dog = new Dog();
        dog.setName("阿黄");
        return dog;
    }

    /***
     * 多实例bean --- 使用
     * @return
     */
    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "destroyMethod")
    public Pig pig() {
        Pig pig = new Pig();
        pig.setName("八戒");
        return pig;
    }
}
