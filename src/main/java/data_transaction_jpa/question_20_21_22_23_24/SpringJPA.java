package data_transaction_jpa.question_20_21_22_23_24;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
/**
 *
 * ORM (Object relational model): mapping between object oriented data to relational data.
 * JPA (Java persistence Api) : specification to implement ORM.
 *
 * Advantages of ORM:
 *  +Mapping between object/table.
 *  +Automatic management of connection aquisition/release...
 * Disadvantages:
 *  -JDBC more powerful(efficiency).
 *  -PK is mandatory.
 *
 * Copied from {@link ...}{@// TODO: 06/07/2019
 *  * Spring v5.0 Professional Certification.
 *  * <p>
 *  * Question 022:<br>
 *  * What is a PersistenceContext and what is an EntityManager. What is the relationship between both?<br>
 *  * Why do you need the @Entity annotation. Where can it be placed?<br>
 *  * <p>
 *  * Answer:<br>
 *  * <b>PersistenceContext</b> is a set of cached entity instances. Within persistence context entities and their lifecycle
 *  * are managed. Set of entities (actually a set of related classes) is uniquely identified by a persistence unit
 *  * (a database).<br>
 *  * An <b>EntityManager</b> is essentially an API to access <b>PersistenceContext</b>. Each <b>EntityManager</b> is
 *  * associated with a <b>PersistenceContext</b>.<br>
 *  * <p>
 *  * {@link Entity} annotation can be applied at a <b>class-level</b> only. Only annotated class is considered to be
 *  * an <b>entity-class</b> (according to JPA specification) and is used to be mapped to a database record.<br>
 *  *
 *  * @author Valentine Shemyako
 *  * @since January 07, 2019 }
 *
 *
 *
 *
 * 1-What do you need to do in Spring if you would like to work with JPA?
 *      EntityManagerFactoryBean is mandatory to work with JPA.
 *      {@link EntityManagerFactory} is responsible of managing entityManager {@link EntityManager}
 * 
 *
 * copied from {@link}{@// TODO: 07/07/2019
 *  * Spring v5.0 Professional Certification.
 *  * <p>
 *  * Question 026:<br>
 *  * What does @PersistenceContext do?<br>
 *  * <p>
 *  * Answer:<br>
 *  * {@link PersistenceContext} is analogous to a well-known {@link Autowired} Spring Framework annotation, but the sole
 *  * purpose of it is to inject {@link EntityManager} instance. Spring Framework goes further injecting not the
 *  * instance itself, but a proxy which takes care of transaction management and thread-safety ({@link EntityManager}
 *  * instance is by definition not thread-safe).<br>
 *  * <p>
 *  * As another option {@link PersistenceUnit} might be used to inject {@link EntityManagerFactory} instance for obtaining {@link EntityManager}.
 *  *
 *  * @author Valentine Shemyako
 *  * @since January 08, 2019
 *
 * }
 *
 *
 * 2-Are you able to participate in a given transaction in Spring while working with JPA?
 *      JpaTransactionManager support direct datasource access.
 * 
 * Which PlatformTransactionManager(s) can you use with JPA?
 *      JpaTransactionManager : single transactional resource.
 *      JtaTransactionManager : several transactional resource.
 * Which PlatformTransactionManager(s) can you use with JDBC?
 *      DataSourceTransactionManager
 *      JpaTransactionManager : single transactional resource.
 * What do you have to configure to use JPA with Spring? How does Spring Boot make this
 * easier? spring-boot-starter-data-jpa -- Spring Boot autoconfigures data access layer related beans.
 *
 */
public class SpringJPA {
}
