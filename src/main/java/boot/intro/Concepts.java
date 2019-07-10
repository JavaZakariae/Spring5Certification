package boot.intro;


/**
 *
 * • What is Spring Boot?
 *      - An extension of spring framework, it autoconfigure automatically the application.
 *      - Auto-configuration means bean creation based on the classpath jars.
 *      - Spring Boot offers an actuator, that help to check info of the application, like health, stats....
 *      - Possibility to package the application as a jar file.
 * • What are the advantages of using Spring Boot?
 *      - Facility to manage dependencies.
 *      - Spring boot starter.
 *      - Beans Auto-configuration.
 *      - no xml configuration.
 *
 * • Why is it “opinionated”?
 *      - Spring framework team has his own opinion how the spring application should be started.
 *          (auto-configured bean, jars, .....).
 *      - Convention over configuration helps to reduce the decisions that should be made by the developers.
 *
 * • What things affect what Spring Boot sets up?
 *      The starters that are added to the dependencies.(only if @AutoConfiguration or @SpringBootApplication are enabled)
 *      The @Condition affect if spring boot will autoconfigure some other bean.
 *
 * • What is a Spring Boot starter POM? Why is it useful?
 *      It is jar file that Contains many other dependencies. Normally dependencies in a starter jar
 *      are organized by the type of functionality they can bring.(spring-boot-starter-web for web,....)
 *
 * • Spring Boot supports both properties and YML files. Would you recognize and understand them if you saw them?
 *      Yes ^_^
 *
 * • Can you control logging with Spring Boot? How?
 *      * debug=true in the properties file.
 *      * --debug or --trace as arguments parameters
 *      * specify other logging jar as dependencies(logback is the default logging impl)
 *
 * • Where does Spring Boot look for property file by default?
 *      application.properties
 *
 * • How do you define profile specific property files?
 *      application-prod.properties
 *      application-test.properties
 *      spring.profiles.active=dev,test
 *
 * • How do you access the properties defined in the property files?
 *      1- @Value("${spring.property}")
 *
 *      2- Environment env
 *         env.getProperty("spring.property")
 *      3- @ConfigurationProperties (map property value to pojo)
 *         https://stackoverflow.com/questions/30528255/how-to-access-a-value-defined-in-the-application-properties-file-in-spring-boot
 *
 * • What properties do you have to define in order to configure external MySQL?
 *      datasource.Driver, username, password, url
 *
 * • How do you configure default schema and initial data?
 *      src/main/resources/
 *                      schema.sql
 *                      data.sql
 *      spring.datasource.initialization-mode=always
 *
 * • What is a fat far? How is it different from the original jar?
 *      fat jar contains all the dependencies, and an embedded container like tomcat.
 *      so the app can be launched only by "java -jar app.jar"
 *
 * • What is the difference between an embedded container and a WAR?
 *      embedded container will be packaged to the jar and will contains only one application.
 *      a War should be deployed into a web container, like tomcat, the web container can also cpontans more than one application.
 *
 * • What embedded containers does Spring Boot support?
 *     Tomcat
 *     Jetty
 *     Undertow
 **
 *
 */
public class Concepts {
}
