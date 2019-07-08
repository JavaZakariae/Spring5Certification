package data.question_25_26_27_28_29.services;

import data.commun.Person;
import data.commun.Profession;
import data.question_25_26_27_28_29.repositories.AddressRepository;
import data.question_25_26_27_28_29.repositories.CompanyRepository;
import data.question_25_26_27_28_29.repositories.PersonRepository;
import data.question_25_26_27_28_29.repositories.ProfessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService implements service {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    ProfessionRepository professionRepository;

    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void add( Person person )
    {
        personRepository.save(person);

    }
    @Override
    public List<Person> getListOfPersons() {
        return  this.personRepository.findAll();
    }

    @Override
    public void remove( Person person ) {
        this.personRepository.delete(person);
    }
}
