package ioc.question_011;

import ioc.commun.Profession;
import ioc.question_004.MyConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;


public class MyApplicationContext_011 {


    public static void main( String[] args ) {
        ApplicationContext apContext = new AnnotationConfigApplicationContext(MyBeanFactoryPostProcessor.class);
        final Profession profession = apContext.getBean(Profession.class);
        System.out.println(profession);


    }
}
