package ioc.question_28_29_30_31;


import ioc.commun.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.EnvironmentCapable;
import org.springframework.context.EnvironmentAware;
import org.springframework.stereotype.Component;

import java.util.Arrays;


/**
 * Environment represents the condition in which the the current application is running(active profiles, properties...)
 *
 * The Application context implements the interface {@link EnvironmentCapable}, so it can get the Environment object.
 *
 * The beans in the application context can implement {@link EnvironmentAware} to get a reference to the Environment object.
 *
 */
@Configuration
public class MyEnvironement {

    /**
     *
     * @param env is injected by the app context
     *
     * @return the list of the active profiles.
     */
    @Bean
    public String [] activeProfiles( Environment env ){
        ((ConfigurableEnvironment) env).setActiveProfiles("dev");
        return env.getActiveProfiles();
    }

    /**
     *
     * @param env is injected by the app context.
     * @return the property java.version (property of JVM)
     */
    @Bean
    public String  javaVersion( Environment env ){
        return env.getProperty("java.version");
    }

    @Bean
    public Person p1(){
        return Person.builder().profession(null)
                     .dateOfBirth(null)
                     .age(32).name("aziz")
                     .build();
    }

    @Bean
    public MySpringExpressionLanguage msel(){
        return new MySpringExpressionLanguage();
    }

    /**
     * running program that show how we can get the properties using the Environment object
     */
    @Component
    public static class run{
        public static void main( String[] args ) {
            ApplicationContext ctx = new AnnotationConfigApplicationContext(MyEnvironement.class);
            String [] activeProfiles = (String[]) ctx.getBean("activeProfiles");
            System.out.println(Arrays.toString(activeProfiles));
            String javaVersion= (String) ctx.getBean("javaVersion");
            System.out.println(javaVersion);
            MySpringExpressionLanguage mySpEL = (MySpringExpressionLanguage) ctx.getBean("msel");
            System.out.println(mySpEL.getLiteral()+" "+mySpEL.getPersonname()+" "+mySpEL.getIntegerListlis());

        }
    }
}
