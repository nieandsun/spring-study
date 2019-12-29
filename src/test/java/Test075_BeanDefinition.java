import com.nrsc.springstudy.C075_bean_life_cycle_BeanDefinition.beans.InstA;
import com.nrsc.springstudy.C075_bean_life_cycle_BeanDefinition.config.C075Config;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test075_BeanDefinition {


    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(C075Config.class);
        InstA instA = (InstA) ac.getBean("instA");

        System.out.println(instA);
    }
}
