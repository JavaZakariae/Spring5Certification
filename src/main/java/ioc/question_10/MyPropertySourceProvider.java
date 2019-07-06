package ioc.question_10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.StandardEnvironment;

import java.util.HashMap;
import java.util.Map;

/**
 * What is a property source?
 * it is any source of key->value pairs.
 * Standalone App
 *  1-JVM properties.
 *  2-OS properties.
 * WEb App:
 *  3-ServletConfig parameters.
 *  4-ServletContext parameters.
 *  5-JNDI properties.
 *
 * We can create a new custom property source as this class below:
 */


public class MyPropertySourceProvider implements EnvironmentAware {


    public static void main( String[] args ) {
        ApplicationContext apContext = new AnnotationConfigApplicationContext(MyConfiguration_010.class);

    }

    @Override
    public void setEnvironment( Environment environment ) {
        Map<String, Object> newEnvironementVariables = new HashMap<>();
        newEnvironementVariables.put("July",7);
        newEnvironementVariables.put("out",8);
        newEnvironementVariables.put("September",9);
        newEnvironementVariables.put("Ocober",10);

        MapPropertySource sourceProvider = new MapPropertySource("newEnvironementVariables", newEnvironementVariables);
        ((StandardEnvironment) environment).getPropertySources().addLast(sourceProvider);
        System.out.println(environment.getProperty("July"));
       // System.out.println(environment.getProperty("belgium.brussels.street"));
    }
}
