package data.commun;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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


    //one person could have only one adress
    @OneToOne
    private Address address;

    // TODO: 07/07/2019
    @ManyToOne
    @JoinColumn(name = "Profesion_id")
    private Profession profession;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;


    public Profession getProfession() {
        return profession;
    }
}
