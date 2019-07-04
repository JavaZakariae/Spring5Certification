package ioc.question_028_029_030_031;


import ioc.commun.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @// TODO: 04/07/2019 What can you reference using SpEL?
 *
 * Expression starting with $: expression that reference a property in the application environment.
 * Expression starting with #: spring expression language parsed by SpEL parser that can reference
 *      Literal, Methods, List, Operator, Constructor,.....
 */
@Component
@Qualifier("msel")
public class MySpringExpressionLanguage {

      @Value("#{p1.name}")
      private String personname;


      @Value("#{123}")
      private int literal;

      @Value("#{{1,2,3}}")
      private List<Integer> integerListlis;


      public int getLiteral() {
            return literal;
      }

      public String getPersonname() {
            return personname;
      }

      public List<Integer> getIntegerListlis() {
            return integerListlis;
      }
}
