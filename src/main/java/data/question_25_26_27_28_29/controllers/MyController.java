package data.question_25_26_27_28_29.controllers;

import data.commun.Person;
import data.question_25_26_27_28_29.services.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyController {

    @Autowired
    service myService;

    @Autowired
    ApplicationContext ctx;

    public void init(){
        Person person1 = ctx.getBean("person1", Person.class);
        Person person2 = ctx.getBean("person2", Person.class);
        myService.add(person1);
        System.out.println("person1 was saved");
        myService.add(person2);
        System.out.println("person2 was saved");
        myService.remove(person2);
        System.out.println("person2 was saved");

    }

    public void testOneToOne(){
    }

    public void testOneToMany(){
    }

    public void testManyToOne(){
    }


    public void testManyToMany(){
    }

    public void testAllRelations() {
        testManyToMany();
        testManyToOne();
        testOneToMany();
        testOneToOne();
    }

    public void printPersonsList() {
        System.out.println(myService.getListOfPersons());
    }

}
