package com.IPSEI.mapsrecicle.model;

import lombok.Data;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
@Data
@Entity
public class AdminPoint {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String email;
    private int cpf;
    private int cnpj;
    private String password;
    private int phoneNumber;

    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String profilePictureUrl;
    @OneToMany(mappedBy = "adminpoint", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Point> books;
}

