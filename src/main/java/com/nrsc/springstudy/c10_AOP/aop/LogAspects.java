package com.nrsc.springstudy.c10_AOP.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/***
 * @author : Sun Chuan
 * @date : 2019/12/1 14:42
 * Description：日志切面类
 *
 *  前置通知: 在执行目标方法div()之前运行--------------------------------------@Before
 *  后置通知: 在目标方法div运行结束之后运行 ,不管有没有异常--------------------@After
 *  返回通知: 在目标方法div正常返回值后运行------------------------------------@AfterReturning
 *  异常通知: 在目标方法div出现异常后运行--------------------------------------@AfterThrowing
 *
 *  环绕通知: 需要手动执行joinPoint.procced()(其实就是执行目标方法div,),
 * 						执行joinPoint.procced()之前的方法相当于前置通知,
 * 						执行之后就相当于后置通知--------------------------------@Around
 */
@Aspect
@Component
public class LogAspects {

    @Pointcut("execution(public int com.nrsc.springstudy.c10_AOP.service.Calculator.*(..))")
    public void pointCut() {
    }

    @Before("pointCut()") //前置通知
    public void logStart(JoinPoint joinPoint) {
        //获取到请求参数列表
        Object[] args = joinPoint.getArgs();
        //获取到请求方法
        String name = joinPoint.getSignature().getName();
        System.out.println("@Before:当前方法为：" + name + "======参数列表是:" + Arrays.asList(args));
    }

    @After(value = "pointCut()") //后置通知
    public void logEnd(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println("@After---" + name + "方法结束......");
    }

    @AfterReturning(value = "pointCut()", returning = "result") //返回通知
    public void logReturn(Object result) {
        System.out.println("@AfterReturning---正常返回......运行结果是:{" + result + "}");
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception") //异常通知
    public void logException(Exception exception) {
        System.out.println("@AfterThrowing运行异常......异常信息是:{" + exception + "}");
    }

//    @Around("pointCut()") //环绕通知 --- 工作中我习惯用这个
//    public Object Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("@Arount:执行目标方法之前...");
//        //相当于开始调div地
//        Object obj = proceedingJoinPoint.proceed();
//        System.out.println("@Arount:执行目标方法之后...");
//        return obj;
//    }

    @Around("pointCut()") //环绕通知 --- 工作中我习惯用这个
    public Object Around(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("@Arount:执行目标方法之前...");
        //相当于开始调div地
        Object obj = null;
        try {
            obj = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            System.out.println("@Around运行异常......异常信息是:{" + throwable.getMessage() + "}");
            //throwable.printStackTrace();
        }
        System.out.println("@Arount:执行目标方法之后...");
        return obj;
    }
}
