

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

        UserService userService = ac.getBean(UserService.class);
        userService.addUserAndSalary("张三", BigDecimal.valueOf(1000));

        ac.close();
    }
}
