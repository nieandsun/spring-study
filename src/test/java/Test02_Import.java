import com.nrsc.springstudy.c2_import.config.ImportStudyConfig1;
import com.nrsc.springstudy.c2_import.config.ImportStudyConfig2;
import com.nrsc.springstudy.c2_import.config.ImportStudyConfig3;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test02_Import {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ImportStudyConfig1.class);

        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test02() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ImportStudyConfig2.class);

        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test03() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ImportStudyConfig3.class);

        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
