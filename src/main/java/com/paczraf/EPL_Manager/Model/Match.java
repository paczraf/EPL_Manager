package com.paczraf.EPL_Manager.Model;

import lombok.Data;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "matches")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Club teamNo1;
    @OneToOne
    private Club teamNo2;
    private int teamNo1Goals;
    private int teamNo2Goals;
    @OneToOne
    private Tactic teamNo1Tactic;
    @OneToOne
    private Tactic teamNo2Tactic;
    private int result;
}