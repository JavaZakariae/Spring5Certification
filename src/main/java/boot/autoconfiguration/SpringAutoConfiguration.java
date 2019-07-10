package boot.autoconfiguration;

/**
 *
 * • How does Spring Boot know what to configure?
 *      Auto-configuration is provided by spring boot autoconfigure.
 *      This jar list the bean that should be auto-configured in the file:
 *          org/springframework/boot/spring-boot-autoconfigure/2.1.6.RELEASE/spring-boot-autoconfigure-2.1.6.RELEASE.jar!/META-INF/spring.factories.
 *      Usually, the auto-configured class are annotated by @ConditionalOnClass, or @OnConditionalBean, ..., it
 *      specify required  conditions to auto-configure the bean.
 *      ConditionalOnClass, ConditionalOnMissingClass, ConditionalOnBean, ConditionalOnMissingBen
 *      ConditionalOnProperty (presence of a property in the environment properties), ConditionalOnResource
 *      ConditionalOnWebApplication, ConditionalOnNotWebApplication, ConditionalOnExpression(spring EL)
 *
 * • What does @EnableAutoConfiguration do?
 *      Enable auto-configuration
 *
 * • What does @SpringBootApplication do?
 *      @Configuration
 *      @EnableAutoConfiguration
 *      @ComponentScan(enable scnaning and creation of stereotype component)
 *
 * • Does Spring Boot do component scanning? Where does it look by default?
 *      if we use @SpringBootApplication yes, spring will scan from the package where the main class is found
 *      and below. We can alter this behaviour by redefining the @ComponentScan annotation.
 *      We can also use @Configuration and @ComponentScan to allow scanning.
 *
 * • How are DataSource and JdbcTemplate auto-configured?
 *      based on the jar found in the classpath(spring-boot-starter-jdbc), spring boot auto-configure those components.
 *
 * • What is spring.factories file for?
 *      spring.factories contains the class that should be scanned for auto-configuration.
 *
 * • How do you customize Spring auto configuration?
*
 * • What are the examples of @Conditional annotations? How are they used?
 *      see the first question.
 *
 *
 */
public class SpringAutoConfiguration {
}
