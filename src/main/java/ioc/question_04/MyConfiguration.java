package ioc.question_04;

import ioc.commun.Person;
import ioc.commun.Profession;
import org.springframework.context.annotation.*;

import java.time.LocalDate;

@Configuration
public class MyConfiguration {

    @Bean
    public Profession profession(){
        return Profession.builder()
                         .name("professor")
                         .description("professor in the university")
                         .build();
    }

    @Bean
    public Person person(){
        return Person.builder()
                     .name("Bagna")
                     .age(52)
                     .profession(profession())
                     .dateOfBirth(LocalDate.of(1950,12,13))
                     .build();
    }



}
