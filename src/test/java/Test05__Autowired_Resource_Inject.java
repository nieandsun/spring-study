import com.nrsc.springstudy.c05_Autowired_Resource_Inject.config.C05DemoConfig01;
import com.nrsc.springstudy.c05_Autowired_Resource_Inject.config.C05DemoConfig02;
import com.nrsc.springstudy.c05_Autowired_Resource_Inject.test01.Test05Service01;
import com.nrsc.springstudy.c05_Autowired_Resource_Inject.test02.Test05Service02;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test05__Autowired_Resource_Inject {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(C05DemoConfig01.class);
        Test05Service01 test05Service01 = ac.getBean(Test05Service01.class);
        test05Service01.whichRepository();
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }


    @Test
    public void test02() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(C05DemoConfig02.class);
        Test05Service02 test05Service02 = ac.getBean(Test05Service02.class);
        test05Service02.whichRepository();
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
