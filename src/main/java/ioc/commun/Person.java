package ioc.commun;
import lombok.*;

import java.time.LocalDate;


@Builder
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Person {
    private String name;
    private int age;
    private LocalDate dateOfBirth;
    private Profession profession;
}
