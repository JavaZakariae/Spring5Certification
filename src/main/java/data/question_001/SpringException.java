package data.question_001;


/**
 *  What is the difference between checked and unchecked exceptions?
 * • Why does Spring prefer unchecked exceptions?
 * • What is the data access exception hierarchy?
 *
 *
 *
 *
 * Checked exception should be managed in a try catch block or should be declared on the method signature.
 * unchecked exception don't have this restriction.
 * For this reason Spring Framework prefer to use the unchecked exception.
 * All the exceptions in the data access hierarchy are unchecked.
 * The purpose is to isolate the applications from particularity of vendor specification.
 *
 */
public class SpringException {




}
