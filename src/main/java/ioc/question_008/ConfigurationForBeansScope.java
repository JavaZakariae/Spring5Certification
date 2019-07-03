package ioc.question_008;

import ioc.commun.Person;
import ioc.commun.Profession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.LocalDate;

@Configuration
public class ConfigurationForBeansScope {


    /**
     *
     * @return a new instance of the profession class whenever it is called
     */
    @Bean
    @Scope(scopeName = "prototype")
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
