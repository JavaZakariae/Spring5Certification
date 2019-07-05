package ioc.question_008.dao_008;

import ioc.commun.Person;

public interface dao {
    boolean save( Person person );

    boolean delete( Person person );
}
