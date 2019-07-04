package ioc.question_013_014_015_016;

import ioc.commun.Person;
import ioc.commun.Profession;
import ioc.question_012.MyConfiguration_012;
import ioc.question_012.model.Company;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

/**
 * 1-What does component-scanning do?
 *  Already answered in the previous questions.
 *
 * 2-What is the behavior of the annotation @Autowired with regards to field injection,
 * constructor injection and method injection?
 *  Can be applied to a private field, constructor or method.
 *  By default autowiring something by @Autowired means that the injection is mandatory(otherwise a runtimeexception is thrown),
 *  We can alter this behaviour by three ways:
 *      a- @Autowired(required=false).
 *      b- @Optional
 *      c- @Nullable
 * 
 * What do you have to do, if you would like to inject something into a private field? How does
 * this impact testing? for better testing, it is preferable to inject beans on setter or constructor.
 * 
 * How does the @Qualifier annotation complement the use of @Autowired?
 *  it for dependecy injection by name. Helpful when there are manay condiadte for the injection with the same type.
 * @Qualifier can be used in many places : on class, annotated method method...
 * we can customise this annotation, see {@link }
 *
 *
 *
 */
@ComponentScan
@Configuration
public class DependencyInjection {

    public static void main( String[] args ) {
        ApplicationContext apContext = new AnnotationConfigApplicationContext(DependencyInjection.class);
        Course course = (Course) apContext.getBean("course");
        System.out.println(course);
        ((AnnotationConfigApplicationContext) apContext).close();
    }

    @Bean
    public Profession profession(){
        return Profession.builder()
                .name("professor")
                .description("professor in the university")
                .build();
    }

    @Bean
    @Language("fr")
    public Person p1(){
        return Person.builder()
                .name("Bagna")
                .age(52)
                .profession(profession())
                .dateOfBirth(LocalDate.of(1950,12,13))
                .build();
    }
}
