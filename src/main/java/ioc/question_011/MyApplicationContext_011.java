package ioc.question_011;

import ioc.commun.Profession;
import ioc.question_004.MyConfiguration;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;


public class MyApplicationContext_011 implements BeanFactoryPostProcessor {


    public static void main( String[] args ) {
        ApplicationContext apContext = new AnnotationConfigApplicationContext(MyBeanFactoryPostProcessor.class);
        final Profession profession = apContext.getBean(Profession.class);
        System.out.println(profession);
    }

    /**
     * this beanfactorypostprocessor implementation can ask for a bean from the factory bean and modify its bean definition
     * before any instantiation.
     * in a context application, we can have multiple beanfactorypostprocessors.
     *
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory( ConfigurableListableBeanFactory beanFactory ) throws BeansException {

    }
}
