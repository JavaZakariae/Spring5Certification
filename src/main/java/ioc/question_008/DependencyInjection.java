package ioc.question_008;

import ioc.commun.Person;
import ioc.question_004.MyConfiguration;
import ioc.question_008.dao_008.MyDaoRepository;
import ioc.question_008.dao_008.dao;
import ioc.question_008.service_008.MyService;
import ioc.question_008.service_008.service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Can you describe:
 * 1-Dependency injection using Java configuration?
 * 2-Dependency injection using annotations (@Autowired)?
 * 3-Component scanning, Stereotypes?
 * 4-Scopes for Spring beans? What is the default scope?
 *
 *  1-Java configuration:
 *      @Bean the annotated method will produces a bean that will be managed by the container.
 *      @Configuration indicates that the annotated class contains one or more methods annotated by @Bean.
 *  2,3- (@Component, @Autowired)
 *      @Component indicate that the annotated class can be automaticaly detected and registred as a @Bean in the
 *      application context.
 *      @Autowired indicated that the container should look for a bean and inject it in the annoted place.
 *      @ComponentScan define a root package that should be scanned to create @Bean.
 *
 *  Some stereotype :
 *      @Component:     Root annotation, uses as a componenet scan condidate.
 *      @Service:       Business logic.
 *      @Repository:    Data access logic.
 *      @Controller:    Web Controller class.
 *      @Configuration: Class that declare beans to be loaded and managed by the container.
 *
 */

@Configuration
@Import(MyConfiguration.class)
@ComponentScan(basePackageClasses = {MyDaoRepository.class, MyService.class} )
public class DependencyInjection {

    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DependencyInjection.class);
        dao myDaoRepository = (MyDaoRepository) context.getBean("myDaoRepository");
        service myService = (service) context.getBean("myService");
        System.out.println(myDaoRepository);
        Person p = context.getBean(Person.class);
        myService.save(p);
        System.out.println(myDaoRepository);
        myService.delete(p);
        System.out.println(myDaoRepository);


    }

}
