package ioc.question_18_19_20;


import ioc.commun.Profession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1- Advantages of Java Config in comparison to the xml way:
 *      type safe(possible errors thrown in compilation time)
 *    Disadvantage:
 *      recompilation in case of modification, not the samething for xml configuration.
 *
 * 2-What does the @Bean annotation do?
 *      Annotated on a method in a configuration class, it indicates to the container to manage the created bean, it also means that the
 *      specified bean is on full mode, inter-calls between bean are intercepted by the container.
 *      Annotated on a class level, specified bean is on lite mode, no interception by the container in case of inter-calls
 *      @todo full vs lite mode
 *
 * 3- Why are you not allowed to annotate a final class with @Configuration?<br>
 *    How do @Configuration annotated classes support singleton beans?<br>
 *    Why can’t @Bean methods be final either?<br>
 *
 *    a-Configuration class are proxied using GCLIB way.
 *    b-call to beans annotated method are intercepted by the proxy.
 *    c-the same as a.
 *
 */
@Configuration
//private, final are forbidden here
public  class JavaConfiguration {

    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        Profession profession = context.getBean("p4_2", Profession.class);
        System.out.println(profession);
    }

    @Bean(name = "profession")
    public Profession profession1(){
        return Profession.builder()
                .name("professor1")
                .description("professor in the university")
                .build();
    }

    @Bean(value = "p2")
    public Profession profession2(){
        return Profession.builder()
                .name("professor2")
                .description("professor in the university")
                .build();
    }

    @Bean("p3")
    public Profession profession3(){
        return Profession.builder()
                .name("professor3")
                .description("professor in the university")
                .build();
    }

    @Bean({"p4_1","p4_2"})
    //private, final are forbidden here
    public Profession p4(){
        return Profession.builder()
                .name("professor4")
                .description("professor in the university")
                .build();
    }
}
