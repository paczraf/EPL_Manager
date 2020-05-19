package com.paczraf.EPL_Manager.Model;

import lombok.Data;

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
    private int result;
}