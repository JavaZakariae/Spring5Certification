package ioc.question_009;

import ioc.commun.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 *  Are beans eagerly or layzily instantiated?
 *
 *  - Only the singleton beans are eagerly instantiated(this means that they are instantiated
 *   before asking a bean from the container but as part of the initialisation of the container).
 *
 *  - Modifying to lazy instantiation will let the beans instantiated only when requested.
 *   When Object A contains object B, When B is eagerly instantiated, the Object A will be eagerly instantiated.
 *
 *
 *  Place to configure the initialisation type:
 *      @Configuration class level.
 *      @Component class level.
 *      @Bean method factory level.
 *
 *
 */

public class LazyBeanInitialisation {

    public static void main( String[] args ) {
        ApplicationContext apContext = new AnnotationConfigApplicationContext(LazyBeanConfiguration.class);
        Person p = (Person) apContext.getBean("person");
        System.out.println(p);
        Person p2 = (Person) apContext.getBean("person2");
        System.out.println(p2);


    }

}
