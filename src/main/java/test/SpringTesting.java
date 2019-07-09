package test;


/**
 * • Do you use Spring in a unit test?
 *      Unit test should not depend on Spring, Spring framework doesn't inject dependency in a unit test.
 *      For ths purpose, we use Mock object to be used in place of the real dependencies.
 *
 * • What type of tests typically use Spring?
 *      integration test, main goals are:
 *              To manage SpringIoc between tests.
 *              To provide Dependency injection.
 *              To provide Transaction Management.
 *
 * • How can you create a shared application context in a JUnit integration test?
 *      @ContextConfiguration(classes=...)
 *
 * • When and where do you use @Transactional in testing?
 *      can be use at class level or method level. annotated on a method
 *      means that the transaction should rollback after execuing the method.
 *      We can alter this behaviour by @RollBack(false), or @Commit
 *
 * • How are mock frameworks such as Mockito or EasyMock used?
 *      Used to isolate the unit of code to be tested.
 *
 *
 * • How does Spring Boot simplify writing tests?
 * • What does @SpringBootTest do? How does it interact with @SpringBootApplication
 * and @SpringBootConfiguration?
 *
 *  No need oto use @Configuration, but the @SpringBootTest will by default try to locate the @SpringBootApplication.
 *  Utilities classes like @TestRestTemplate.
 *  testing part of the application with; JsonTest, DataJpaTest....
 *
 *
 */
public class SpringTesting {


}
