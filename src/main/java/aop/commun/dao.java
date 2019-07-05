package aop.commun;

import ioc.commun.Person;

public interface dao {
    public boolean save( Person person );
    public boolean delete( Person person);
}
