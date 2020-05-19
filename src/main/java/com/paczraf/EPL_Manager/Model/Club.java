package com.paczraf.EPL_Manager.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}
