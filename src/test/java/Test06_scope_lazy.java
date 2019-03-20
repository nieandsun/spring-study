import com.nrsc.springstudy.c06_scope_lazy.bean.Cup06;
import com.nrsc.springstudy.c06_scope_lazy.config.C06Config1;
import com.nrsc.springstudy.c06_scope_lazy.config.C06Config2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test06_scope_lazy {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(C06Config1.class);
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        Cup06 cup061 = (Cup06) ac.getBean("cup06");
        Cup06 cup062 = (Cup06) ac.getBean("cup06");

        System.out.println(cup061==cup062);

    }


    @Test
    public void test02() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(C06Config2.class);
        System.out.println("spring容器初始化完成");
        Cup06 cup061 = (Cup06) ac.getBean("cup06");
    }
}
