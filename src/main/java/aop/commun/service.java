package aop.commun;

import ioc.commun.Person;

public interface service {
    public boolean save( Person person );
    public boolean delete( Person person);
}
