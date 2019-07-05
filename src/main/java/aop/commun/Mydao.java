package aop.commun;

import ioc.commun.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Mydao implements dao {

    List<Person> personList = new ArrayList<>();

    @Override
    public boolean save( Person person ){
        return this.personList.add(person);
    }

    @Override
    public boolean delete( Person person ){
        return  this.personList.remove(person);
    }
}
