package ioc.question_12.model;

import ioc.commun.Person;
import lombok.*;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.time.LocalDate;
import java.util.List;

@Builder
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Company implements DisposableBean, InitializingBean {

    private String name;
    private String description;
    private LocalDate dateOfBirth;
    private List<Person> workersList;


    @Override
    public void destroy() throws Exception {
        System.out.println(" destroy() called inside the class "+Company.class.getName());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(" afterPropertiesSet() called inside the class "+Company.class.getName());
    }


    @PostConstruct
    public void postconstruct(){
        System.out.println(" postconstruct jsr-250 called inside the class "+Company.class.getName());
    }

    @PreDestroy
    public void predestroy(){
        System.out.println(" predestroy jsr-250 called inside the class "+Company.class.getName());
    }

    private void initialisationOfTheBean() {
        System.out.println(" initialisationOfTheBean called inside the class "+Company.class.getName());
    }

    private void destructionOfTheBean() {
        System.out.println(" destructionOfTheBean called inside the class "+Company.class.getName());
    }

}
