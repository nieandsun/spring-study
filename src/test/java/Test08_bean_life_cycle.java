import com.nrsc.springstudy.c072_bean_life_cycle.config.C072Config;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Sun Chuan
 * @date : 2019/11/18 15:24
 * Description:
 */
public class Test08_bean_life_cycle {


    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(C072Config.class);
        System.out.println("IOC容器创建完成........");

        //UserService userService = (UserService) ac.getBean("userService");

       // userService.whichRepository();

    }
}
