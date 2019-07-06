package data_transaction_jpa.question_20_21_22_23_24;


/**
 * Why is the term "unit of work" so important and why does JDBC AutoCommit violate this pattern?
 *  unit of work--> atomicity.
 *  Jdbc AutoCommit violate this pattern, because after each query,
 *  a commit will be executed, so if we have many query we will not have the atomicity property.
 *
 */
public class JDBCAutoCommitMode {
}
