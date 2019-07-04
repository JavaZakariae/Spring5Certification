package ioc.question_013_014_015_016;

import ioc.commun.Person;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Course {
    private String title;
    private String description;
    private Person teacher;

    public Course(  ) {}

    @Autowired()
    public Course( @Autowired(required = false)String title, @Autowired(required = false)String description,@Autowired(required = true) @Language("fr") Person teacher ) {
        this.title = title;
        this.description = description;
        this.teacher = teacher;
    }
}
