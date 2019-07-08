package data.commun;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity( name = "Address")
public class Address {
    @Id
    private Integer id;
    private String street;
    private int number ;
    private String city;

}
