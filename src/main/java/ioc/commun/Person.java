package ioc.commun;
import lombok.*;


@Builder
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Person {

    private String name;
    private int age;
    private Profession profession;


}
