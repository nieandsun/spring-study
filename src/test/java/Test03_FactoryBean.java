import com.nrsc.springstudy.c03_factorybean.bean.Apple;
import com.nrsc.springstudy.c03_factorybean.bean.MyFactoryBean2;
import com.nrsc.springstudy.c03_factorybean.config.*;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test03_FactoryBean {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(FactoryBeanConfig1.class);
        //看源码解析图
        Object myFactoryBean = ac.getBean("myFactoryBean");
        System.out.println("myFactoryBean=====" + myFactoryBean.getClass());
        System.out.println(myFactoryBean.toString());

        //看源码解析图
        MyFactoryBean bean = (MyFactoryBean) ac.getBean("&myFactoryBean");

        System.out.println("&myFactoryBean=====" + bean.getClass());

        try {
            Apple apple = bean.getObject();
            System.out.println(apple);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(bean.getObjectType());
        System.out.println(bean.isSingleton());

        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test02() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(FactoryBeanConfig2.class);
        //看源码解析图
        Object myFactoryBean = ac.getBean("com.nrsc.springstudy.c03_factorybean.config.MyFactoryBean");
        System.out.println("myFactoryBean=====" + myFactoryBean.getClass());
        System.out.println(myFactoryBean.toString());

        //看源码解析图
        MyFactoryBean bean = (MyFactoryBean) ac.getBean("&com.nrsc.springstudy.c03_factorybean.config.MyFactoryBean");

        System.out.println("&myFactoryBean=====" + bean.getClass());

        try {
            Apple apple = bean.getObject();
            System.out.println(apple);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(bean.getObjectType());
        System.out.println(bean.isSingleton());

        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }


    @Test
    public void test03() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(FactoryBeanConfig3.class);
        //看源码解析图
        Object myFactoryBean = ac.getBean("myFactoryBean2");
        System.out.println("myFactoryBean=====" + myFactoryBean.getClass());
        System.out.println(myFactoryBean.toString());

        //看源码解析图
        MyFactoryBean2 bean = (MyFactoryBean2) ac.getBean("&myFactoryBean2");

        System.out.println("&myFactoryBean=====" + bean.getClass());

        try {
            Apple apple = bean.getObject();
            System.out.println(apple);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(bean.getObjectType());
        System.out.println(bean.isSingleton());

        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}
