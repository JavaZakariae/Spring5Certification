package data.question_08_09_10_11;


/**
 *
 * -What is a transaction?
 *      A transaction in a unit of work that should either fully executed or fully canceled.
 *      transaction principals are: ACID.
 *       A: Atomicity, the same as the definition of the transaction.
 *       C: Consistency, guarantee that evey database constraint will not be violated.
 *       I: Isolation, isolation level that defines how more than one transactions are handled win parallel.
 *       D: Durability, guarantee that when the transaction commit, the change are also stored into the database.
 * -What is the difference between a local and a global transaction?
 *      Local transaction: when we deel with inly one single transactional resource.
 *      Global transaction: more than one transactional resource, handled by the app-server.
 *
 *   Is a transaction a cross cutting concern? YEs
 *   How is it implemented by Spring? implemented using AOP Spring framework
 *
 */
public class MyTransaction {}
