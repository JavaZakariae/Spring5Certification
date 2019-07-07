package data.commun;


import lombok.*;

import javax.persistence.*;


@Builder
@Setter
@Getter
@EqualsAndHashCode
@ToString
@Entity(name = "Professions")
public class Profession {

    @Id
    @Column(name = "Identifiant")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Description")
    private String description;


}
