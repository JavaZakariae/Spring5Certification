package boot.testing;


/**
 * Some Anwsers from https://reflectoring.io/spring-boot-test/.
 *
 * • When do you want to use @SpringBootTest annotation?(integration test)
 *      Spring Boot provides a convenient way to start up an application context to be used in a test *
 *      Spring Boot provides the @SpringBootTest annotation which we can use to create
 *      an application context containing all the objects we need for all of the above test types
 *
 * • What does @SpringBootTest auto-configure?
 *      @SpringBootTest by default starts searching in the current package of the test class and then searches upwards through the package structure,
 *      looking for a class annotated with @SpringBootConfiguration from which it then reads the configuration to create an application context.
 *      This class is usually our main application class since the @SpringBootApplication annotation includes the @SpringBootConfiguration annotation.
 *      It then creates an application context very similar to the one that would be started in a production environment.
 *
 * • What dependencies does spring-boot-starter-test brings to the classpath?
 *      spring-boot-starter, spring-boot-test-autoconfigure, junit
 *      assertj, mockito, hamcrest, spring core,  spring test
 *
 * • How do you perform integration testing with @SpringBootTest for a web application?
 *
 * • When do you want to use @WebMvcTest? What does it auto-configure?
 *      Testing the front web layer(controller)
 *      fire up an application context that contains only the beans
 *      needed for testing a web controller.
 *
 * • What are the differences between @MockBean and @Mock?
 *      @Mock from Mockito, should be initialized by the mockito framework.
 *      @MockBean from Spring, handeled by the spring framework.
 *
 * • When do you want @DataJpaTest for? What does it auto-configure?
 *      provides a convenient way to set up an environment with an embedded database to test our database queries against.
 *
 */
public class SpringBootTesting {
}
