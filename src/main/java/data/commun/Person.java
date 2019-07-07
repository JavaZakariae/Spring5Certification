package data.commun;
import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.time.LocalDate;


@Builder
@Setter
@Getter
@EqualsAndHashCode
@ToString
@Entity(name = "Persons")
public class Person {

    @Id
    @Column(name = "Identifiant")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Age")
    private int age;

    @Column(name = "Date_of_Birth")
    private LocalDate dateOfBirth;

    // TODO: 07/07/2019
    @ManyToOne
    @JoinColumn(name = "Profesion_id")
    private Profession profession;



}
