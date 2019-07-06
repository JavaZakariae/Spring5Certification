package ioc.question_08;


/**
 * Scopes of beans, What is the default scope?
 *  Stand-alone application scopes:
 *      1-Singleton scope: default scope, unique in the application context.
 *      2-Prototype: new instance whenever the bean is requested in the application context.
 *
 *  WebApplication scopes:
 *      3-Request scope : new instance for every new Request. {@link org.springframework.web.context.request.RequestScope}
 *      4-Session scope : new instance for every new Session.{@link org.springframework.web.context.request.SessionScope}
 *      5-Application scope : new instance for every new ServletContext.{@link org.springframework.web.context.annotation.ApplicationScope}
 *      6-WebSocket scope : new instance for every new WebSocket.
 */
public class BeansScope {
}
