package ioc.question_10;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("keyvalue.properties")
//@PropertySource("C:\\Users\\bouali\\Desktop\\Learning\\Spring\\Spring_certification\\Spring5Certification\\src\\main\\java\\ioc\\question_10\\keyvalue.properties")
//@todo modifying the fiule location
public class MyConfiguration_010 {

    @Bean
    public MyPropertySourceProvider sourceProvider(){
        return new MyPropertySourceProvider();
    }
}
