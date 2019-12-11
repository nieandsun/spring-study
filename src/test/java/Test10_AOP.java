import com.nrsc.springstudy.c10_AOP.config.C10Config;
import com.nrsc.springstudy.c10_AOP.service.Calculator;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 *  @author : Sun Chuan
 *  @date : 2019/12/1 16:06
 *  Description：
 */
public class Test10_AOP {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(C10Config.class);
        Calculator bean = ac.getBean(Calculator.class);
        int div = bean.div(4, 2);
        System.err.println("=====结果为=======" + div);
        ac.close();
    }
}
