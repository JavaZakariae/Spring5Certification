package data.question_25_26_27_28_29.configuration;
import data.commun.*;

import data.question_25_26_27_28_29.controllers.MyController;
import data.question_25_26_27_28_29.repositories.PersonRepository;
import data.question_25_26_27_28_29.repositories.ProfessionRepository;
import data.question_25_26_27_28_29.services.MyService;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;


import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.time.LocalDate;
import java.util.Properties;


@Configuration
public class MyConfiguration {
    @Bean()
    public Profession profession(){
        Profession profession = new Profession();
        profession.setId(1);
        profession.setName("professor");
        profession.setDescription("professor in the university");
        return profession;
    }

    @Bean
    public Person person1(){
        Person p1 = new Person();
        p1.setAge(52);
        p1.setDateOfBirth(LocalDate.of(1950,12,13));
        p1.setId(1);
        p1.setName("Bagna");
        p1.setProfession(profession());
        return p1;
    }
    @Bean
    public Person person2(){
        Person p1 = new Person();
        p1.setAge(45);
        p1.setDateOfBirth(LocalDate.of(1970,1,1));
        p1.setId(2);
        p1.setName("Alia");
        p1.setProfession(profession());
        return p1;
    }

    @Bean
    public DataSource firstDataSource (){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/ride_tracker?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("password");
        return driverManagerDataSource;
    }

    @Bean
    LocalContainerEntityManagerFactoryBean entityManagerFactory( DataSource dataSource) {
        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource);
        entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        entityManagerFactoryBean.setPackagesToScan("data");
        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        jpaProperties.put("hibernate.hbm2ddl.auto", "create-drop");
        jpaProperties.put("hibernate.show_sql", "true");
        jpaProperties.put("hibernate.format_sql", "true");
        entityManagerFactoryBean.setJpaProperties(jpaProperties);
        return entityManagerFactoryBean;
    }

    @Bean
    JpaTransactionManager transactionManager( EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }
}



