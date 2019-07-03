package ioc.question_004;


import ioc.commun.Person;
import ioc.commun.Profession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
                     .profession(profession())
                     .build();
    }

}
