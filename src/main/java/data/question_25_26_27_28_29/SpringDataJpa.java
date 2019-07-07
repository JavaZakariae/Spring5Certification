package data.question_25_26_27_28_29;

import data.commun.Person;
import data.question_25_26_27_28_29.repositories.PersonRepository;
import data.question_25_26_27_28_29.repositories.ProfessionRepository;
import data.question_25_26_27_28_29.services.MyService;
import data.question_25_26_27_28_29.services.service;
import data.question_25_26_27_28_29.configuration.MyConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

/**
 *
 * 1• What is a Repository interface?
 * 2• How do you define a Repository interface? Why is it an interface not a class?
 * 3• What is the naming convention for finder methods in a Repository interface?
 * 4• How are Spring Data repositories implemented by Spring at runtime?
 * 5• What is @Query used for?
 *
 * 1•   A repository interface need no implementation to guarantee the crud operations.
 *      They are already implemented by spring data jpa, we can implement our own query by adding more method tp the interface.
 * 2•   Extends from a Repository. Interfaces allow to use proxy object to intercept calls.
 * 3•   @todo example to make
 * 4•   https://stackoverflow.com/questions/38509882/how-are-spring-data-repositories-actually-implemented
 *      Jdk proxy intercepts method calls.
 * 5•   to specify a query to be used in the repository.
 *
 */
@Configuration
@EnableJpaRepositories(basePackageClasses = { PersonRepository.class, ProfessionRepository.class})
@Import(MyConfiguration.class)
@ComponentScan( basePackageClasses =MyService.class)
@EnableTransactionManagement

public class SpringDataJpa  {

    /**
     * The way we use Myservice is only for testing purpose and should not be used like that.
     * @param args
     */
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringDataJpa.class);
        service myService = applicationContext.getBean(MyService.class);
        Person person1 = applicationContext.getBean("person1", Person.class);
        Person person2 = applicationContext.getBean("person2", Person.class);
        init(myService, person1, person2);
        printPersonsList(myService);
    }

    /**
     * for initialisation purpose, we can use CommadLineRunner, but we should
     * add a dependency to springboot.
     * For this example we will not use springboot
     * @param service
     * @param person1
     * @param person2
     */
    private static void init( service service, Person person1, Person person2 ) {
        service.add(person1);
        System.out.println("person1 was saved");
        service.add(person2);
        System.out.println("person2 was saved");
    }



    /**
     *
     * @param service
     */
    private static void printPersonsList( service service ) {
        System.out.println(service.getListOfPersons());
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
