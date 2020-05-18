package Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surname;
    @OneToOne
    private Club club;
    private String position;
    private int gkSkills;
    private int dfSkills;
    private int mdSkills;
    private int fwSkills;

}
