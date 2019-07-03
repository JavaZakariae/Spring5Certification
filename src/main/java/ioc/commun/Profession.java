package ioc.commun;


import lombok.*;

@Builder
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Profession {
    private String name;
    private String description;
}
