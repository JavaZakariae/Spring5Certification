package rest;

/**
 * • What does @RequestMapping do?
 *      Applied on class or method.
 *
 *  • Is @Controller a stereotype? Is @RestController a stereotype?
 *      Yes, Yes
 *
 * • What is a stereotype annotation? What does that mean?
 *      to define a role.
 *
 * • What is the difference between @Controller and @RestController?
 *      @RestController = @ResponsBody+@Controller
 * • When do you need @ResponseBody?(@ResponsBody the returned data will be inserted directly to the body of the response)
 *      When wee need to return a representation of an object in json or xml.
 *
 * • What are the HTTP status return codes for a successful GET, POST, PUT or DELETE
 * operation?
 *      -1xx: informational
 *      -2xx succeed
 *      -3xx redirection
 *      -4xx client error
 *      -5xx server error
 *
 * • When do you need @ResponseStatus?
 *      Attaching status to the response.
 *      When we use @ResponsBody, Status is always 200, to alter this behaviour,
 *      we can use ResponseEntity.
 *
 * • Where do you need @ResponseBody? What about @RequestBody? Try not to get these
 * muddled up!
 *      Row data converted from requestbody to object, or from object to response body.
 *
 * • Do you need Spring MVC in your classpath?
 *      Yes.
 *
 * • What Spring Boot starter would you use for a Spring REST application?
 *      spring-boot-starter-web
 *
 * • What are the advantages of the RestTemplate?
 *      Make http calls.
 *      Automatic conversion between raw data a,d object using httpMessageConverter.
 *
 */
public class RestController {
}
