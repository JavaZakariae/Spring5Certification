package boot.actuator;

/**
 *
 * • What value does Spring Boot Actuator provide?
 *         Monitoring and managing the application (Auditing, health, metrics, .....)
 *
 * • What are the two protocols you can use to access actuator endpoints?
 *      Http, JMX
 *
 * • What are the actuator endpoints that are provided out of the box?
 *      auditevents : exposes audit events information
 *      beans: Displays all beans of the application
 *      caches : exposes available caches.
 *      conditions: condition evaluated on configuration and auto-configuration.
 *      configprops : all @ConfigurationProperties
 *      env : display environment properties from ConfigurableEnvironment
 *      flyway: anyFlyway database
 *      httptrace:  httptraceinformation(by default, last 100 http req/resp)
 *      info: arbitrary info
 *      integrationgraph: the spring integration graph
 *      liquibase: any liquibase database
 *      metrics: show metrics info
 *      mappings: all @RequestMapping paths.
 *      scheduledtasks: Show the scheduled tasks.
 *      sessions: allows to retrieve or delete a user session.
 *      shutdown: shutdown the application
 *      threaddump: perform a threaddump
 *
 * • What is info endpoint for? How do you supply data?
 *      Display arbitrary info.
 *      we can use info.app.version=x   to customize the /info actuator.
 *                 info.app.name=y
 *                 info.app.description=z
 *
 * • How do you change logging level of a package using loggers endpoint?
 *     Get actuator/loggers  to get all existing logger.
 *     Get /loggers/{loggerId} the loggerId information.
 *     Post /loggers/{loggerId} body {"configuredLevel" : "log_level"}
 *
 * • How do you access an endpoint using a tag?
 *
 * • What is metrics for?
 *      Shows ‘metrics’ information for the current application
 * • How do you create a custom metric with or without tags?
 *
 * • What is Health Indicator?
 *      Shows application health information.
 *
 * • What are the Health Indicators that are provided out of the box?
 *          CassandraHealthIndicator, DiskSpaceHealthIndicator, DataSourceHealthIndicator...
 *
 * • What is the Health Indicator status?
 *      running or shutdown, overall status of the application.
 *
 * • What are the Health Indicator statuses that are provided out of the box
 *      Unknown : indicate an unknown state.
 *      Up:     : functioning as expected.
 *      Down    : unexpect failure.
 *      Out_Of_Service :
 *                take out of service and should not be used.
 *
 * • How do you change the Health Indicator status severity order?
 *      management.health.status.order=DOWN, OUT_OF_SERVICE, UNKNOWN, success
 *
 * • Why do you want to leverage 3rd-party external monitoring system?
 *
 *
 */
public class SpringBootActuator {
}
