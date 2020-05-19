package com.paczraf.EPL_Manager.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@javax.persistence.Table(name = "leagueTable")
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Club clubName;
    private int played;
    private int won;
    private int drawn;
    private int lost;
    private int goalsFor;
    private int goalsAgainst;
    private int goalsDifference;
    private int points;

}
