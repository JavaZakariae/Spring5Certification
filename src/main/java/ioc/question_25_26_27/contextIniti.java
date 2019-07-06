package ioc.question_25_26_27;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *  We can inject property using the @Value annotation.
 *  literal value pr property:  @Value("${prefix.propertyOne}")
 *  value from another object : @Value("#{bean.properti}")
 *
 * @tood Spring expression language
 *
 */

public class contextIniti{
    public static void main( String[] args ) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ValuePropertyInjection.class);
        final ValuePropertyInjection bean = ctx.getBean(ValuePropertyInjection.class);
        System.out.println(bean.street+" "+bean.size+" "+bean.language+" "+bean.name);
    }


    @Configuration
    @PropertySource("keyvalue.properties")
    static class ValuePropertyInjection {
        @Value("${belgium.brussels.street}")
        private String street;
        @Value("${belgium.umons.size}")
        private int size;
        @Value("UMONS")
        private String name;

        private String language;

        //setter value injection @Value("FR")
        //or @Autowired
        public void setLanguage( @Value("FR") String language) {
            this.language = language;
        }
    }
}
