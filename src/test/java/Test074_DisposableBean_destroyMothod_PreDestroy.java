import com.nrsc.springstudy.c074DisposableBean_destroyMothod_PreDestroy.beans.Duck;
import com.nrsc.springstudy.c074DisposableBean_destroyMothod_PreDestroy.beans.Pig;
import com.nrsc.springstudy.c074DisposableBean_destroyMothod_PreDestroy.config.C074Config;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * @author : Sun Chuan
 * @date : 2019/11/25 19:58
 * Description: 
 */
public class Test074_DisposableBean_destroyMothod_PreDestroy {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(C074Config.class);
        System.out.println("IOC容器创建完成........");
        //使用懒加载的bean -- duck
        Duck duck = (Duck) ac.getBean("duck");
        //使用多实例的bean -- pig
        Pig pig = (Pig) ac.getBean("pig");
        ac.close();
    }
}
