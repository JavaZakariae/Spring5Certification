package data.question_08_09_10_11;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

/**
 *
 * How are you going to define transaction in Spring?
 * What does @Transactional do?
 * What is the PlatformTransactionManager?
 *
 * A transaction Manager {@link  PlatformTransactionManager}, should exists on the classpath to enable transaction management.
 * enable transaction by annotating one configurations class {@link EnableTransactionManagement}.
 * @Transactional on classes or method that should run in transaction.
 *
 *
 * Is the JDBC template able to participate in an existing
 * transaction?
 * This is accomplished by wrapping the DataSource using a TransactionAwareDataSourceProxy.
 */
public class EnablingTransaction {

}

@Service
@Transactional
class Myservice{
    public void methodOne(int a){ }

    //overriding the class annotation
    @Transactional(isolation = Isolation.SERIALIZABLE, propagation = Propagation.MANDATORY)
    public void methodTwo(int a){ }
}



@EnableTransactionManagement
@Configuration
class MyConfiguration{

    /**
     * defining a transaction manager
     * @return
     */
    @Bean
    public PlatformTransactionManager transactionManager (){
        return new DataSourceTransactionManager(datasource());
    }

    /**
     * defining a datasource
     * @return
     */
    public DataSource datasource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("");
        return dataSource;
    }




}
