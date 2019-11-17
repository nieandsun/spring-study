import com.nrsc.springstudy.c08_Conditional.config.C08Config;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Sun Chuan
 * @date : 2019/11/17 23:10
 * Description：
 */
public class Test_08_Conditional {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(C08Config.class);
        System.out.println("IOC容器创建完成........");
    }
}
