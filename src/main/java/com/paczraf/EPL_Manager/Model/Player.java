package com.paczraf.EPL_Manager.Model;

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
    @ManyToOne
    private Club club;
    private String position;
    private int gkSkills;
    private int dfSkills;
    private int mfSkills;
    private int fwSkills;

}
