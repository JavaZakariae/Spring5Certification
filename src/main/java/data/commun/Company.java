package data.commun;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @Id
    private Integer id;
    private String name;
    private int size;
    private String details;

    @ManyToMany
    private List<Company>relations;

    @OneToMany
    private List<Person> workers;
}
