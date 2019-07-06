package ioc.question_04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This class create a standalone application context using the annotation config way.
 * @todo We can use other ways like:
 *      {@link ClassPathXmlApplicationContext}
 */

public class AppContextCreation {


    public static void main( String[] args ) {
        ApplicationContext apContext = new AnnotationConfigApplicationContext(MyConfiguration.class);
        final Object pesrson = apContext.getBean("person");
        System.out.println(pesrson);


    }
}
