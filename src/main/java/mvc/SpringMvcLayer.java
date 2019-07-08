package mvc;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.*;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 *
 * • MVC is an abbreviation for a design pattern. What does it stand for and what is the idea
 *      behind it?
 *
 *      Module View Controller, design pattern to separate concerns for an application that has a user interface.
 *      There are three main parts:
 *      Model: holds the currents data and business logic.
 *      View: Responsible for representing the data of the application.
 *      Controller: acts as a mediator between the view and the model. Accepting request from the view and issuing command to the model
 *                  and finally interact with the view to ask for representing the new data.
 *      Advantage of using MVC:
 *          separation of concerns.
 *          Loose Coupling.
 *          Separation of concerns.
 *
 * • What is the DispatcherServlet and what is it used for?
 *      It is a Servlet that implement the controller part of the web-application:
 *          -It receives requests and delegates them to registred handler(for example controller annotated classes).
 *          -Resolves views
 *          -Resolve Exception that occur during the mapping or the execution.
 *      The DispatcherServelt is not instantiated by the the application context, but instantiated before any app-context that exists.
 *
 *  • What is a web application context? What extra scopes does it offer?
 *      Application context for a webApplication. {@link WebApplicationContext}It extends the application-context, and has a method
 *      that get the ServletContext.
 *      Extra Scope provided by the web application-context are:
 *          -request: bean instance for each request.
 *          -session: bean instance for each session.
 *          -application: bean instance for each web application.
 *
 *
 * There are many ways to create a web-Mvc application, using xml configurations or java configurations.
 * In this class we present a first way using the interface {@link WebApplicationInitializer}
 * by this way and is we use only spring, we should confugure tomcat server to run our application.
 * For this purpose we should use spring boot to facilitate the app deployement.
 *
 *
 */

public class SpringMvcLayer {

}


