package ioc.question_008.service;

import ioc.commun.Person;
import ioc.question_008.dao.MyDaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService implements service {

    @Autowired
    MyDaoRepository myDaoRepository;

    @Override
    public boolean save( Person person ){
        return this.myDaoRepository.save(person);
    }

    @Override
    public boolean delete(Person person){
        return  this.myDaoRepository.delete(person);
    }
}
