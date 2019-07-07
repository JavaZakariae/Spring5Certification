package data.question_12_13;
import org.springframework.transaction.annotation.Isolation;

/**
 * Problems we can get when two or more transactions are executing in parallel on the same data.
 * {@link IsolationLevel.READ_UNCOMMITTED} is the slowest isolation level, T1 can Read uncommitted data from T2.
 * This Isolation level can produces Dirty Read problem:
 * On one cell for example, T1 read 10, T2 write 15,T1 read 15, T2 rollback, T1 get bad result.
 * T1---10---------25---
 * T2---10-----15----10-
 *
 * Dirty read occurs when T1 read data that was not yet committed by another Transaction.
 * To solve this problem we should use {@link IsolationLevel.READ_COMMITTED}
 *
 * With {@link IsolationLevel.READ_COMMITTED}, non-repeatable read problem can be produced.
 * T1---10---------25---
 * T2--------15---------15
 * On one cell for example, T1 read 10, T2 write 15, T1 in a second time read the same cell, as it was updated
 *   by T2, T1 add 10, the value now is 25(bad result).
 *
 *
 * With {@link IsolationLevel.REPEATABLE_READ}, phantom read(read-insertion problem)  problem can be produced.
 *  T1---1---------2---
 *  T2--------2--------
 *  Suppose we have a table person(name, age)
 *  For example, T1 with a query operation(get person.name where person.age>10), suppose also that in T1 we get one row as a response.
 *  suppose now that T2 insert a new row[person('zaki', 30)] and commit. T1 in the second read operation will get 2 rows as a response.
 *  The problem here is maybe In the operation In T1, we are performing an algorithm and we should have the same value of te read operation.
 *  To solve this problem we should use {@link Isolation.Isolation.SERIALIZABLE}. This isolation guarantee that for example, every person with person.age>10
 *  can not be read or written by another transaction.
 *
 * {@link https://www.byteslounge.com/tutorials/spring-transaction-isolation-tutorial}
 *
 */
public class IsolationLevel {
}
