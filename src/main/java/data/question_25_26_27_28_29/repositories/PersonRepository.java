package data.question_25_26_27_28_29.repositories;

import data.commun.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("personRepository")
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
