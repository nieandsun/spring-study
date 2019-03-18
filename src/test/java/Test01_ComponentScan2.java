import com.nrsc.springstudy.c01_componentscan1.study2.config.Config1;
import com.nrsc.springstudy.c01_componentscan1.study2.config.Config2;
import com.nrsc.springstudy.c01_componentscan1.study2.config.Config3;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test01_ComponentScan2 {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config1.class);
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test02() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config2.class);
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test03() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config3.class);
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
