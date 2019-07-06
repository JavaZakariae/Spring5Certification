package data_transaction_jpa.question_02;


import ioc.commun.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("databaseconfig/datasource.properties")
public class MyDataSource {

    @Value("${url}")
    private String url;


    /**
     * This program is only for testing purpose, so it is not a good way of getting and using the jdbctemplate
     * @param args
     * @throws SQLException
     */
    public static void main( String[] args ) throws SQLException {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyDataSource.class);
        DataSource dataSource = context.getBean("thirdDataSource", DataSource.class);
        System.out.println(dataSource.getConnection().getMetaData().toString());
        JdbcTemplate jdbc = context.getBean("jdbcTemplate", JdbcTemplate.class);
        String sglInsert = "insert into persons (name,age,dateOfBirth) values ('bagna','50', '1970-04-12');";
        jdbc.update(sglInsert);
        List<Person> people = rowMapper(jdbc);
        System.out.println("How many people We have in the table ? "+people.size());
        jdbc.execute(sglInsert);
        people = resultSetExtractor(jdbc);
        System.out.println("How many people We have in the table ? "+people.size());

    }

    /**
     * demonstration of the utility of a reselsetExtractor
     * @param jdbc
     * @return
     */
    public static List<Person> resultSetExtractor( JdbcTemplate jdbc ) {
        return jdbc.query("select * from persons", new ResultSetExtractor<List<Person>>() {
            @Override
            public List<Person> extractData( ResultSet rs ) throws SQLException, DataAccessException {
                List<Person> personList = new ArrayList<>();
                while (rs.next()){
                    String name = rs.getString(2);//as we can see the first index in the table is the index 1
                    int age = rs.getInt(3);
                    LocalDate dateofbirth = rs.getDate(4).toLocalDate();
                    personList.add(Person.builder()
                            .name(name)
                            .age(age)
                            .dateOfBirth(dateofbirth)
                            .build());
                }
                return personList;
            }
        });
    }

    /**
     * demonstration of the utility of a rowMapper
     * @param jdbc
     * @return
     */
    public static List<Person> rowMapper( JdbcTemplate jdbc ) {
        return jdbc.query("select * from persons", new RowMapper<Person>() {
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


    /**
     * Ths first datasource implementation create a new connection for every new request.
     * It does not support pooling. it should be used only for testing purpose.
     * @return
     */
    @Bean
    public DataSource firstDataSource (){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl(url);
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("password");
        return driverManagerDataSource;
    }




    /**
     * Ths second datasource implementation uses the same connection for every new request.
     * it should be used only for testing purpose.
     */
    @Bean
    public DataSource secondDataSource (){
        SingleConnectionDataSource singleConnectionDataSource = new SingleConnectionDataSource();
        singleConnectionDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        singleConnectionDataSource.setUrl(url);
        singleConnectionDataSource.setUsername("root");
        singleConnectionDataSource.setPassword("password");
        return singleConnectionDataSource;
    }



    /**
     * Ths third datasource implementation used also for development environment purpose
     * it use an embedded database like db2, derby...
     */
    @Bean
    public DataSource thirdDataSource (){
        final EmbeddedDatabase embeddedDatabase = new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScripts("databaseconfig/ddl.script",//ddl data_transaction_jpa definition language define database schema
                        "databaseconfig/dml.script")//dml data_transaction_jpa manipulation language CRUD operations
                .build();
        return embeddedDatabase;

    }



    /**
     * @// TODO: 05/07/2019  
     * This fourth datasource implementation used for production environment
     * 
     */
    @Bean
    public DataSource fourthDataSource (){
        return null;

    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(thirdDataSource());
    }
}
