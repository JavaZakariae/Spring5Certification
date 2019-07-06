package data_transaction_jpa.question_03_04_05_06_07;


import data_transaction_jpa.question_02.MyDataSource;
import ioc.commun.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 *  Can you execute a plain SQL statement with the JDBC template?<br>
 *
 * {@link org.springframework.jdbc.core.JdbcTemplate#execute(String)} help to execute ddl sql query(void return type)
 * {@link org.springframework.jdbc.core.JdbcTemplate#update(String)}  help to execute dml sql query(int return type [number of rows affected])
 * {@link org.springframework.jdbc.core.JdbcTemplate#queryForObject(String, Class)} query only one row
 *
 *
 */

@Import(MyDataSource.class)
@Configuration
public class SqlQuery {


    /**
     *
     * @param args
     * @throws SQLException
     */
    public static void main( String[] args ) throws SQLException {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyDataSource.class);
        DataSource dataSource = context.getBean("thirdDataSource", DataSource.class);
        System.out.println(dataSource.getConnection().getMetaData().toString());
        JdbcTemplate jdbc = context.getBean("jdbcTemplate", JdbcTemplate.class);

        String queryForOneRow = "select * from persons where name='bagna'";
        Person person = queryForObject(jdbc, queryForOneRow);
        System.out.println(person);
        List<Person> personList = queryForList(jdbc, queryForOneRow);
        System.out.println(person);

    }

    /**
     * query for multiple row
     * @param jdbc
     * @param queryForOneRow
     * @return
     */
    private static List<Person> queryForList( JdbcTemplate jdbc, String queryForOneRow ) {

        return null;
    }

    /**
     * Query for one row
     * @param jdbc
     * @param queryForOneRow
     * @return
     */
    private static Person queryForObject( JdbcTemplate jdbc, String queryForOneRow ) {
        return jdbc.queryForObject(queryForOneRow, new RowMapper<Person>() {
            @Override
            public Person mapRow( ResultSet rs, int rowNum ) throws SQLException {
                String name = rs.getString(2);//as we can see the first index in the table is the index 1
                int age = rs.getInt(3);
                LocalDate dateofbirth = rs.getDate(4).toLocalDate();
                return Person.builder()
                        .name(name)
                        .age(age)
                        .dateOfBirth(dateofbirth)
                        .build();
            }
        });
    }
}
