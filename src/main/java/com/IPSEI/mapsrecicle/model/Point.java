
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
public class Point {
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
    @ManyToOne
    @JoinColumn(name = "adminpoint_id")
    private AdminPoint adminpoint;
  


}
