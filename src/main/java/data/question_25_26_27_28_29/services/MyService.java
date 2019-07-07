package data.question_25_26_27_28_29.services;

import data.commun.Person;
import data.commun.Profession;
import data.question_25_26_27_28_29.repositories.PersonRepository;
import data.question_25_26_27_28_29.repositories.ProfessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService implements service {

    @Autowired
    @Qualifier("personRepository")
    PersonRepository personRepository;


    @Autowired
    ProfessionRepository professionRepository;


    @Override
    public void add( Person person )
    {
        Profession profession = person.getProfession();
        if(profession!=null)
        {
            personRepository.save(person);
            return;
        }
        professionRepository.save(person.getProfession());
        personRepository.save(person);



    }
    @Override
    public List<Person> getListOfPersons() {

        return  this.personRepository.findAll();
    }
}
