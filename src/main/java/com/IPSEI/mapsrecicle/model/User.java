package com.IPSEI.mapsrecicle.model;
import lombok.Data;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

import jakarta.persistence.CascadeType;
@Data
@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String email;
    private int cpf;
    private String password;
    private int phoneNumber;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String profilePictureUrl;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<item> items;
}
    // Constructors, getters, and setters
    