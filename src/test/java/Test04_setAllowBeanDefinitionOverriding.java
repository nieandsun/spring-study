import com.nrsc.springstudy.C04_setAllowBeanDefinitionOverriding.test01.Test04Service;
import com.nrsc.springstudy.C04_setAllowBeanDefinitionOverriding.config.C04DemoConfig01;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test04_setAllowBeanDefinitionOverriding {
    /**
     * 不使用setAllowBeanDefinitionOverriding,发现spring容器中test04Repository只有一个
     */
    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(C04DemoConfig01.class);
        Test04Service test04Service = ac.getBean(Test04Service.class);
        test04Service.whichRepository();
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
    /**
     * 使用setAllowBeanDefinitionOverriding=true,发现spring容器中test04Repository还是只有一个
     */
    @Test
    public void test02() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.setAllowBeanDefinitionOverriding(true);
        ac.register(C04DemoConfig01.class);
        ac.refresh();

        Test04Service test04Service = ac.getBean(Test04Service.class);
        test04Service.whichRepository();
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
    /**
     * 使用setAllowBeanDefinitionOverriding=false,发现会报There is already ... 异常
     */
    @Test
    public void test03() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.setAllowBeanDefinitionOverriding(false);
        ac.register(C04DemoConfig01.class);
        ac.refresh();

        Test04Service test04Service = ac.getBean(Test04Service.class);
        test04Service.whichRepository();
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

}
