package security;
import javax.servlet.Filter;
import org.springframework.context.ApplicationContext;
import org.springframework.security.web.FilterChainProxy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextHolderStrategy;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.Collection;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreFilter;



/**
 * • What are authentication and authorization? Which must come first?
 *      Authentication is the process that verify if someone is who he claims to be.
 *      Authentication is the process that verify if someone has access to some resources.
 *
 * • Is security a cross cutting concern? How is it implemented internally?
 *      Yes.
 *      AOP Proxies for securing methods.
 *      Servlet filters for web access.
 *
 * • What is the delegating filter proxy?
 *     {@link DelegatingFilterProxy  } Servlet Filter, it delegate filtering functionality to a spring bean{@link FilterChainProxy}
 *
 * • What is the security filter chain?
 *     {@link FilterChainProxy} is configured using a list of {@link SecurityFilterChain} instances,
 *     each of which contains a {@link RequestMatcher}and a list of filters which should be applied
 *     to matching requests.
 *
 * • What is a security context?
 *      {@link SecurityContext} is a object that is associated with the current thread, and holds the authentication info.
 *      authentication info are defined by the interface {@link Authentication},{@link SecurityContext} can be retrieved using the  {@link SecurityContextHolder}.
 *
 * • What does the ** pattern in an antMatcher or mvcMatcher do?
 *  pattern like /root/** will match any thing below root/, root/a, root/a/b/c, ...
 *
 *  • Why is the usage of mvcMatcher recommended over antMatcher?
 *      mvcMatcher for example /home, is also associated ith /home/, /home.pdf, .....
 *      antMatcher /home is associated only with /home
 *
 * • Does Spring Security support password hashing? What is salting?
 *  Yes, with {@link PasswordEncoder}
 *
 * • Why do you need method security? What type of object is typically secured at the method
 *  level (think of its purpose not its Java type).
 *      only for method security purpose, no web application.
 *      It add more security in the service layer.
 *      To enable method security annotation, @EnableGlobalMethodSecurity annotation should be applied on a configuration class.
 *
 *  • What do @PreAuthorized and @RolesAllowed do? What is the difference between them?
 *      method level security.
 *      @RoleAllowed, only for role security stufs.
 *      @PreAuthorize, Spel language.
 *
 * • How are these annotations implemented?
 *      Using AOP Proxies.
 *
 * • In which security annotation are you allowed to use SpEL?
 *       {@link PreAuthorize} {@link PostAuthorize}
 *      {@link PreFilter} {@link PostFilter}
 */
public class SpringSecurity {
}
