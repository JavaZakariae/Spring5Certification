package aop.question_005_006_007_008;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAdvices {

    @Before("execution(boolean *..dao.save(..))")
    public void beforesavamethod(){
        System.out.println("beforesavamethod");
    }

    @After("execution(boolean *..dao.save(..))")
    public void aftersavamethod(){
        System.out.println("aftersavamethod");
    }

    //@Around("execution(boolean *.service.save(*))")
    public Object aroundsavemethod( ProceedingJoinPoint pjp){
        System.out.println("aroundsavemethod");
        try {
            return pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }



    @Before("execution(boolean *..dao.save(..))")
    public void showJointPointInfo( JoinPoint jointPoint){

        jointPoint.getArgs();
        jointPoint.getSignature();
        jointPoint.getTarget();
    }

    //method annotated by @Specification
   // @Before(value = "execution(@aop.commun.service.SpecificAnnotation boolean *.service.delete(..))")
    public void beforeannotatedmethod(){
        System.out.println("beforedeletemethod");
    }


    //@todo all remaining expresion(args target bean ......)
    //@After("execution(boolean (@aop.commun.service_008.SpecificAnnotation dao_008).save(*))")
    public void afterannotatedmethod( ){
        System.out.println("afterdeletemethod");
    }

}
