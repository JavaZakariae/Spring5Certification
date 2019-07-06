package ioc.question_01;


/**
 * What is dependency injection and what are the advantages?
 *
 *  Object declare their dependencies, other object(Spring container) create and inject those dependencies.
 *  Several ways:
 *      1- constructor injection(mandatory)
 *      2- setter method injection
 *      3- field injection(the worst way)
 *
 *  Advantages:
 *  1-Loose coupling(between the object and its dependency)
 *  2-coherent code
 *  3-clean code(object creation is externalized)
 *  4-easy testing(using mocked object)
 *
 *  Disadvantage
 *  more classes and interfaces
 */
public class DependencyInjection {
}
