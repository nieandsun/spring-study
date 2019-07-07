import com.nrsc.springstudy.c071_InitializingBean_initMethod_PostConstruct.config.C071Config;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created By: Sun Chuan
 * Created Date: 2019/7/7 22:14
 */
public class Test071_InitializingBean_initMethod_PostConstruct {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(C071Config.class);
        System.out.println("IOC容器创建完成........");
    }
}
