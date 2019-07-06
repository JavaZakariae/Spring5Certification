package ioc.question_11;

import ioc.commun.Person;
import ioc.commun.Profession;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;


/**
 *  What is a BeanFactoryPostProcessor and what is it used for? When is it invoked?
 *  Why would you define a static @Bean method?
 *  What is a PropertySourcePlaceholderConfigurer used for?
 *
 *  {@link BeanFactoryPostProcessor} help to customize the {@link BeanDefinition} loaded to the ioc container
 *
 *  bean factories should be declared as a static method to allow the container to pick them ithout need to instatiate
 *  the configuration class. otherwise problem withg the annotation @Autowired ...
 *
 *
 */
@Configuration
@PropertySource("classpath:/keyvalue.properties")
public class MyBeanFactoryPostProcessor {



    @Bean
    public Profession profession( @Value("${belgium.umons.profession}") String name ){
        return Profession.builder()
                .name(name)
                .description("professor in the university")
                .build();
    }

    @Bean
    public Person person(){
        return Person.builder()
                .name("Bagna_011")
                .age(52)
                .profession(profession("1"))
                .dateOfBirth(LocalDate.of(1950,12,13))
                .build();
    }
}
