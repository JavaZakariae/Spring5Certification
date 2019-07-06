package ioc.question_12;

import ioc.question_12.model.Company;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppContext_012 {


    public static void main( String[] args ) {
        ApplicationContext apContext = new AnnotationConfigApplicationContext(MyConfiguration_012.class);
        Company delhaize = (Company) apContext.getBean("delhaize");
        System.out.println(delhaize);
        ((AnnotationConfigApplicationContext) apContext).close();

    }
}
