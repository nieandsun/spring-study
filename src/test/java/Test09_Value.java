import com.nrsc.springstudy.c09_Value.beans.Cup;
import com.nrsc.springstudy.c09_Value.beans.Dog;
import com.nrsc.springstudy.c09_Value.config.C09Config;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author : Sun Chuan
 * @date : 2019/11/24 19:51
 * Description：
 */
public class Test09_Value {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(C09Config.class);
        Dog dog = (Dog) ac.getBean("dog");
        Cup cup = (Cup) ac.getBean("cup");

        System.err.println("====dog====" + dog);
        System.err.println("====cup====" + cup);

        //简单测试properties文件被加载到了哪里
        ConfigurableEnvironment environment = ac.getEnvironment();
        System.err.println("environment===" + environment.getProperty("cup.name"));
        System.out.println("IOC容器创建完成........");
    }
}
