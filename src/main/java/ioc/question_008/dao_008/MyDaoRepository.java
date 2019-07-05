package ioc.question_008.dao_008;

import ioc.commun.Person;
import lombok.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
//@Builder
@Setter
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class MyDaoRepository implements dao {
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
