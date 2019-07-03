package ioc.question_008.dao;

import ioc.commun.Person;

public interface dao {
    boolean save( Person person );

    boolean delete( Person person );
}
