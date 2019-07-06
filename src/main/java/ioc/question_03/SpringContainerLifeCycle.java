package ioc.question_03;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
/**
 * What is meant by application-context?
 *
 *
 * An application context is an advanced ioc container:
 *  -Bean factory.
 *  -Resource loader.
 *  -Event publishing to registered listener.
 *  -Internationalisation.
 *
 * The life cycle of the application context:
 *  1-Spring IOC is instantiated.
 *  2-Configuration bean metadata is loaded to the container.
 *  3-Bean definition are created from the loaded metadata.
 *  4-Bean definition are adjusted by the {@link BeanFactoryPostProcessor} (example {@link PropertySourcesPlaceholderConfigurer}).
 *  5-Bean are created, property set.
 *  6-{@link BeanPostProcessor#postProcessBeforeInitialization(Object, String)} are invoked.
 *  7-methods of Aware interface are called.
 *  8-{@link javax.annotation.PostConstruct},{@link InitializingBean#afterPropertiesSet()}, {@link Bean#initMethod()} are called.
 *  9-{@link BeanPostProcessor#postProcessAfterInitialization(Object, String)} are invoked.
 *  10-Applicatiuon is running.
 *  11-Applicatiuon stop.
 *  12-Spring Container is closed.
 *  13-{@link javax.annotation.PreDestroy},{@link DisposableBean#destroy()}, {@link Bean#destroyMethod()} are called.
 *
 */
public class SpringContainerLifeCycle {


}
