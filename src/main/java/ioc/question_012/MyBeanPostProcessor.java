package ioc.question_012;
import ioc.question_012.model.Company;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.*;

/**
 * What is a BeanPostProcessor and how it it is different to a BeanFactoryPostProcessor?
 * What is initialisation method and how they are called?
 * What is destroy method and how they are called?
 *
 * {@link BeanPostProcessor} is an interface that permits to extends the functionality$
 * of the contextApplication, it contains 2 methods:
 *  1- {@link BeanPostProcessor#postProcessBeforeInitialization(Object, String)}: called before init beans lifecycle.
 *  2- {@link BeanPostProcessor#postProcessAfterInitialization(Object, String)}: called after init beans lifecycle.
 *
 *  As the BeanFactoryPostProcessors, the BeanpostProcessor should be declared as static beans, like taht they can processor the other Bean correctly.
 *
 */
public class MyBeanPostProcessor implements BeanPostProcessor{


    @Override
    public Object postProcessBeforeInitialization( Object bean, String beanName ) throws BeansException {
        System.out.println(" postProcessBeforeInitialization() called inside the class "+ MyBeanPostProcessor.class.getName()+" for "+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization( Object bean, String beanName ) throws BeansException {
        System.out.println(" postProcessAfterInitialization() called inside the class "+MyBeanPostProcessor.class.getName()+" for "+beanName);
        return bean;
    }
}
