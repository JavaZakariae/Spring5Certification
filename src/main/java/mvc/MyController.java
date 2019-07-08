package mvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * • How is an incoming request mapped to a controller and mapped to a method?
 *      request mapping is based on three part:
 *          - Root ftont contoller: "/"
 *          - Class level web controller mapping: @Controller("/page1") optional
 *          - method level mappingo: GetMapping("/method1") optional
 *
 * • What is the difference between @RequestMapping and @GetMapping?
 *      @RequestMapping for all the method type. class level or method level
 *      @GetMapping for only get method, and maybe the head part. only on method level.
 *
 *
 * • What is @RequestParam used for?
 *      is used to bind a request parameter to a method parameter. MVC supports:
 *          -query parameters: localhost:8080/persons?age>10&weight>40.
 *          -form data the form is sent in the body of the request.
 *          -parts of multipart request
 *      by default a parameter is required, an exception will be thrown, unless we customise this behaviour.
 *
 *
 * • What are the differences between @RequestParam and @PathVariable?
 *      Path variable is used to reference  uri path variable.
 *
 * • What are some of the parameter types for a controller method?
 *      {@link WebRequest} to access request metadata.
 *      {@link ServletRequest}, {@link ServletResponse}
 *
 * • What other annotations might you use on a controller method parameter? (You can
 *   ignore form-handling annotations for this exam)
 *
 *   - {@link MatrixVariable} to bind name-value pairs from URI segments
 *   - {@link RequestBody} to bind body of web-request
 *   - {@link RequestHeader} to bind web-request header
 *   - {@link RequestPart} to bind part of multipart request
 *   - {@link CookieValue} to bind cookie value<br>
 *   - different attributes: {@link ModelAttribute}, {@link RequestAttribute}, {@link SessionAttribute}
 *
 *
 * • What are some of the valid return types of a controller method?
 *   void, null, View, Model, ModelAndView, String, HttpHeaders, HttpEntity, ResponseEntity
 *
 *     ResponseEntity=HttpEntity+ResponseStatus
 *     HttpEntity=HttpHeaders+Body
 *
 * @RestController=@Controller+@ResponseBody
 *
 *
 * How is the right View chosen when it comes to the rendering phase?
 *  the right view is chosen by the DispatcherServlet#render method wich consist of the following steps:
 *      1- {@link mvc/mvcViewResolver.PNG}
 *
 */
@Controller
public class MyController {

    public String get(){
        return "get";
    }
}
