package data.question_03_04_05_06_07;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 *  1-What is the Template design pattern and what is the JDBC template?
 *  2-What is a callback? What are the three JdbcTemplate callback interfaces that can be used
 *      with queries? What is each used for? (You would not have to remember the interface
 *      names in the exam, but you should know what they do if you see them in a code sample).
 *  3-Can you execute a plain SQL statement with the JDBC template?
 *  4-When does the JDBC template acquire (and release) a connection, for every method
 *      called or once per template? Why?
 *  5-How does the JdbcTemplate support generic queries? How does it return objects and
 *      lists/maps of objects?
 *
 *
 * 1-Template design pattern define some steps which are executed in order, the super type define this order,
 * the subclasses implement only some predefined steps.
 * 2-
 *   a- RowMapper<Object>: allows to handle rows in a result set row by row {@link data.question_02.MyDataSource#rowMapper(JdbcTemplate)}.
 *   b-resultSetExtractor<List<Object>>:
 *                         allows to process the entire result set {@link data.question_02.MyDataSource#resultSetExtractor(JdbcTemplate)}.
 *   c-@todo example to make for the RowCallbackHandler
 * * 3-yes
 * 4-Jdbc template release the connection after every request. jdbctemplate is trade safe
 * 5-
 *
 * 6-Operation which are performed by the jdbctemplate:
 *      -open the connection
 *      -prepare execute statement
 *      -iterate through the resultset
 *      -exception processing
 *      -transaction handeling
 *      -close connection statement and the result set
 *  Operation that the client should perform:
 *      -configuration of the connectiopn parameters
 *      -sql statement and its parameters
 *      -mapping for result set
 *
 */
public class MyJdbcTemplate {

    /**
     * this method is final because the squeleton of the program should be respected
     */
    public final void templateMethod(){
        init();
        method1();
        method2();
        method3();
        destroy();
    }
    public final void init() {}
    public void method1() {throw new RuntimeException("the method1 should be implemented");}
    public void method2() {throw new RuntimeException("the method2 should be implemented");}
    public void method3() {throw new RuntimeException("the method3 should be implemented");}
    public final void destroy() {}


}
