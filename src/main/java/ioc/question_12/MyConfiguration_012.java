package ioc.question_12;


import ioc.commun.Person;
import ioc.commun.Profession;
import ioc.question_12.model.Company;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Configuration
public class MyConfiguration_012 {

    @Bean
    public Profession profession(){
        return Profession.builder()
                .name("It-Worker")
                .description("work in the it-field of Delhaize de lion")
                .build();
    }

    @Bean
    public Person p1(){
        return Person.builder()
                .name("Bagna")
                .age(42)
                .profession(profession())
                .build();
    }

    @Bean
    public Person p2(){
        return Person.builder()
                .name("nico")
                .age(38)
                .profession(profession())
                .build();
    }


    @Bean
    public List<Person> persons (){
        return Arrays.asList(p1(),p2());
    }


    @Bean(initMethod = "initialisationOfTheBean", destroyMethod = "destructionOfTheBean")
    public Company delhaize(){
        return Company.builder()
                .name("Delhaize")
                .dateOfBirth(LocalDate.of(1950,01,01))
                .description("Company of food")
                .workersList(persons())
                .build();
    }


    @Bean
    public static MyBeanPostProcessor beanPostProcessor(){
        return new MyBeanPostProcessor();
    }
}
