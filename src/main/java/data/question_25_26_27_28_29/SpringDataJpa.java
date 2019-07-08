package data.question_25_26_27_28_29;

import data.commun.Person;
import data.question_25_26_27_28_29.controllers.MyController;
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
@Import(MyConfiguration.class)
@EnableTransactionManagement
@EnableJpaRepositories(basePackageClasses = { PersonRepository.class, ProfessionRepository.class})
@ComponentScan( basePackageClasses = {MyService.class, MyController.class})
public class SpringDataJpa  {

    /**
     * The way we run this application is only for testing purpose and should not be used like that.
     * @param args
     */
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringDataJpa.class);
        MyController controller = applicationContext.getBean(MyController.class);
        controller.init();
        controller.testAllRelations();
        controller.printPersonsList();
    }

}
