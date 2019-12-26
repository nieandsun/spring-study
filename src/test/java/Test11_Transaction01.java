

import com.nrsc.springstudy.c11_Transaction01.config.C11Config01;
import com.nrsc.springstudy.c11_Transaction01.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

/***
 * @author : Sun Chuan
 * @date : 2019/12/18 15:44
 * Description: 
 */
public class Test11_Transaction01 {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(C11Config01.class);

        UserService userServiceImpl = (UserService) ac.getBean("userServiceImpl");
        userServiceImpl.addUserAndSalary("张三", BigDecimal.valueOf(1000));

        UserService userServiceImpl2 = (UserService) ac.getBean("userServiceImpl2");
        userServiceImpl2.addUserAndSalary("李四", BigDecimal.valueOf(2000));

        ac.close();
    }
}
