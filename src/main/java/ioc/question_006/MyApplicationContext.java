package ioc.question_006;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;


/**
 * How are you going to create an ApplicationContext in an integration test?
 *
 *
 * StandAlone Application: Application Context in an integration test is loaded by {@link ContextConfiguration} annotation
 * WebApplication : {@link ContextConfiguration } annotation along with {@link WebAppConfiguration} .
 */
public class MyApplicationContext {
}
