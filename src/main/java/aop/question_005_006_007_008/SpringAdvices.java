package aop.question_005_006_007_008;

import aop.commun.MyService;
import aop.commun.Mydao;
import aop.commun.service;
import ioc.commun.Person;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import java.time.LocalDate;

/**
 *  Q5:
 *  How many advice types does Spring support. Can you name each one?
 *  What different advice types are used for?
 *  Which types of advices can you use if you would like to try and catch exceptions?
 *
 * @Before  advice runs before a joint point execution.
 * @After   advice runs after a joint point execution.(regardless of how the method finished)
 * @AfterReturning
 *          advice runs after a joint point execution.(only if the method finished normally without throwing exception)
 * @AfterThrowing
 *          advice runs after a joint point execution.(only if the method throed an exception)
 * @Around  advice that surrounds the execution of the joint point(@Before and @After).
 *
 *
 * @AfterThrowing and @Around can be used to try and catch an exception.
 * @AfterReturning has one more parameter: returning value help to get the value returned by the method, also the declared returning
 *                type help to restrict the returning type.
 * @AfterThrowing has one more parameter: throwing value  that can help to restrict the type of the exception.
 *
 * Q6:
 * What do you have to do to enable the detection of the @Aspect annotation?
 * What does @EnableAspectJAutoProxy do?
 *
 * To enable @Aspect, the annotation @EnableAspectJAutoProxy should be applied to a configurations class.
 * note that the aspectjweaver should be on the classpath to use EnableAspectJAutoProxy.
 * Only class annotated with (aspect+Component) or (Aspect+Bean) will be taked in consideration for creating advices.
 *
 * Q7-
 *  @// TODO: 05/07/2019  within() this() target() args() @target @args @within @annotation bean
 *
 *
 * Q8-What is the JoinPoint argument used for?
 * is an interface that can be used as a first argument in the advice method of the following types:
 * @Before @After @AfterReturning @AfterThrowing
 * the joinPoint gives information about the methods an the target object...
 *
 * Q9-What is the ProceedingJoinPoint?
 *
 * used in the Around Advice, allows to control the execution of the advised method.
 * for example we can adjust the arguments of the method, stp the execution of the method
 * or catching exception thrown by method.
 *
 *
 *
 */
@EnableAspectJAutoProxy()
@ComponentScan(basePackageClasses = {MyService.class, Mydao.class, MyAdvices.class})
@Configuration
public class SpringAdvices {

    public static void main( String[] args ) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringAdvices.class);
        service myService = ctx.getBean(MyService.class);
        Person p1 = (Person) ctx.getBean("person");
        myService.save(p1);

    }
    @Bean
    public Person person(){
       return Person.builder()
                 .name("Bagna")
                 .age(52)
                 .profession(null)
                 .dateOfBirth(LocalDate.of(1950,12,13))
                 .build();
        }

}
