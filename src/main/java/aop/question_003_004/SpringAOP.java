package aop.question_003_004;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * How does Spring solves the cross cutting concerns?  using proxied object.
 *
 * Spring uses two type of proxy dependeing of the type of the proxied target.
 *  JDK dynmaic proxies * CGLIb proxies(see Ioc question @todo).
 *  CGLIB dynamically crete subclasses: the subclasses implement the proxy
 *  JDK dynamic proxy : feature of the jdk, for interfaces only
 *
 *  The default proxi type used is the JDK dynamic proxy, to alter this behaviour
 *  you should set the value true to the {@link EnableAspectJAutoProxy#proxyTargetClass()} attribute.
 *
 *  proxies limitation see Ioc question @todo.
 *
 */


public class SpringAOP {
}