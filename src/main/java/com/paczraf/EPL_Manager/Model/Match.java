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
    private Club homeClub;
    @OneToOne
    private Club awayClub;
    private int homeClubGoals;
    private int awayClubGoals;
    @OneToOne
    private Tactic homeClubTactic;
    @OneToOne
    private Tactic awayClubTactic;
    private int result;
}