package ioc.question_09;


import ioc.commun.Person;
import ioc.commun.Profession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.time.LocalDate;

@Configuration
@Lazy//mark every bean to be initialized lazily
public class LazyBeanConfiguration {

    @Bean
    public Profession profession(){
        return Profession.builder()
                .name("professor009")
                .description("professor in the university")
                .build();
    }

    @Bean
    public Person person(){
        System.out.println("person");
        return Person.builder()
                .name("Bagna_009")
                .age(52)
                .profession(profession())
                .dateOfBirth(LocalDate.of(1950,12,13))
                .build();
    }

    @Bean
    @Lazy(false)//override the Class annotation
    public Person person2(){
        System.out.println("person2");
        return Person.builder()
                .name("Bagna2_009")
                .age(52)
                .profession(profession())
                .dateOfBirth(LocalDate.of(1950,12,13))
                .build();
    }

}
