package ioc.question_008.service;

import ioc.commun.Person;

public interface service {
    boolean save( Person person );

    boolean delete( Person person );
}
