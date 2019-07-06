package ioc.question_17;

/**
 *   
 * What is a proxy object and what are the two different types of proxies Spring can create?
 * What are the limitations of these proxies (per type)?
 * What is the power of a proxy object and where are the disadvantages?
 *
 *  Proxy object wrap some target object, thus they can intercept calls to the target object.
 *   Spring AOP use two types of proxy depending on the proxied target object:
 *      1-JDK Dynamic Proxy:
 *              No need to outer library dependencies), the procied should implement at least one interface.
 *              no inner call from the proxy.
 *
 *      2-CGLIB proxy :
 *              need of an external library.
 *              no inner call from the proxy.
 *              proxied object class should be not final.
 *              no interception to the final, private method.
 *
 *  Advantages:
 *      Solution for the Cross cutting problem(Logging, Security, Caching, Transaction Management...).
 *      Code duplication decrease.
 *      Business logic isolated.
 *
 */
public class question_017 {
}
