package ioc.question_07;


import ioc.commun.Person;
import ioc.commun.Profession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class MyConfiguration {

    @Bean
    public Profession profession(){
        return Profession.builder()
                         .name("professeur")
                         .description("professeur a l'universite")
                         .build();
    }

    @Bean
    public Person person(){
        return Person.builder()
                     .name("wijsen")
                     .age(52)
                     .dateOfBirth(LocalDate.of(1960,01,30))
                     .profession(profession())
                     .build();
    }

}
