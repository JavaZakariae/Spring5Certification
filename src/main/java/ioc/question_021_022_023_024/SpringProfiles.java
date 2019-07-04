package ioc.question_021_022_023_024;


import ioc.commun.Profession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 *  How do you configure profiles? What are possible use cases where they might be useful?
 *   Can you use @Bean together with @Profile?
 *   Can you use @Component together with @Profile?
 *   How many profiles can you have?
 *
 * A profile is a named state that help the container to decide witch beans manages.
 * The purpose it to adapt the app to :
 *  Different environments: development, testing, production...
 *  Different user/client requirements..
 *
 * spring.profiles.active  = dev        : to specify active profile(s)
 * spring.profiles.default = default    : to specify the default profile
 *
 */
@Profile("testing")
@Configuration
public class SpringProfiles {

    @Bean
    @Profile("developement")
    public Profession profession1(){
        return Profession.builder()
                .name("professor")
                .description("professor in the university")
                .build();
    }

}

@Profile("testing & developement")
@Configuration
class SpringProfilesConfiguration{
    //@Bean annotated method

}
