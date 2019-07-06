package ioc.question_08.dao_008;

import ioc.commun.Person;

public interface dao {
    boolean save( Person person );

    boolean delete( Person person );
}
