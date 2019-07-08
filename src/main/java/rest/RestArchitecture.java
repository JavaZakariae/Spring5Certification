package rest;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageConverter;

/**
 * • What does REST stand for?
 *      Representational State transfer.(transferring representation of resource over the web)
 *      Uniform interface
 *      Stateless(session stored in the cleint side, not the inverse)
 *      Cacheable(client can cach response)
 *      Client-server(clients dos not care about how the inplementation in the server)
 *
 * • What is a resource?
 *      data identified by an URI.
 *
 * • What does CRUD mean?(Rest mainly use http protocol)
 *      Create  Post
 *      Read    Get
 *      Update  Put
 *      Delete  Delete
 *
 * • Is REST secure? What can you do to secure it?
 *      Rest dos nt define security stuf, security could be managed by using https for example
 *
 * • Is REST scalable and/or interoperable?
 *   Which HTTP methods does REST use?
 *   What is an HttpMessageConverter?
 *      {@link HttpMessageConverter} is used to convert {@link HttpInputMessage}  to object of required type,
 *      and converting object to required {@link HttpOutputMessage} .
 *
 *  • Is REST normally stateless?
 *      Normally should.
 *
 */
public class RestArchitecture {
}
