package com.IPSEI.mapsrecicle.model;


import lombok.Data;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;

@Data
@Entity
public class item {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String category;

    private Double quantidade;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}


