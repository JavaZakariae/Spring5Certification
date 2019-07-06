package data_transaction_jpa.question_14_15_16_17_18_19;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 *  1-What does transaction propagation mean?
 *   Behaviour of a transaction in relation to another transaction, there are 7 propagation types:
 *   T1
 *   a(){
 *       T2
 *       b();
 *   }
 *   {@link Propagation#REQUIRED} //default in Spring
 *      T2 will use T1 if T1 exists, will create a new Transaction otherwise.
 *   {@link Propagation#REQUIRES_NEW}
 *      every time, T2 will crete a new transaction.
 *   {@link Propagation#NESTED}
 *      T2 will use T1 if T1 exists, will create a new Transaction otherwise. If T2 rollback, T1 will rollback to.
 *   {@link Propagation#SUPPORTS}
 *      use T1 if it exists, do nothing otherwise
 *   {@link Propagation#NOT_SUPPORTED}
 *       suspend T1 if it exists, do nothing otherwise
 *   {@link Propagation#NEVER}
 *       throw an exception if T1 exist, do nothing otherwise
 *   {@link Propagation#MANDATORY}
 *       throw an exception if T1 doesn't exist, use T1 otherwise
 *
 *  2-What happens if one @Transactional annotated method is calling another @Transactional annotated method on the same object instance?
 *    the inner method will not run on a transactional mode.
 *  3-Where can the @Transactional annotation be used? What is a typical usage if you put in class level?
 *  4-What does declarative transaction management mean?
 *      Class, method level. method override class level. All method in a annotated class level will be automatically annotated.
 *  5-What is the default rollback policy? How can you override it?
 *     rollback whenever an unchecked exception (RuntimeException or Error)is thrown from a method.
 *     thrown in this scenario means that it was not cached by a try block catch in the method.
 *  6- rollback policy overridden by :
 *     rollBackFor
 *     rollBackForClassName
 *     noRollBackFor
 *     noRollBackForClassName
 *
 *
 */
public class TransactionPropagation {




}
