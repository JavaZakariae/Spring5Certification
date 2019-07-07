package data.question_25_26_27_28_29.configuration;
import data.commun.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


import javax.sql.DataSource;
import java.time.LocalDate;


@Configuration
public class MyConfiguration {


    @Bean()
    public Profession profession(){
        return Profession.builder()
                .name("professor")
                .description("professor in the university")
                .build();
    }

    @Bean
    public Person person1(){
        return Person.builder()
                .name("Bagna")
                .age(52)
                .profession(profession())
                .dateOfBirth(LocalDate.of(1950,12,13))
                .build();
    }
    @Bean
    public Person person2(){
        return Person.builder()
                .name("Alia")
                .age(45)
                .profession(profession())//@todo how to explicitly ask for a new Bean
                .dateOfBirth(LocalDate.of(1970,1,1))
                .build();
    }

/*
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("mysqluser");
        dataSource.setPassword("mysqlpass");
        dataSource.setUrl(
                "jdbc:mysql://localhost:3306/myDb?createDatabaseIfNotExist=true");

        return dataSource;
    }
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em
                = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(dataSource());
        em.setPackagesToScan(new String[] { "com.baeldung.persistence.model" });

        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        return em;
    }*/


}



