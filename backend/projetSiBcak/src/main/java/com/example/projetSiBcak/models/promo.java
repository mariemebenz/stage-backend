package com.example.projetSiBcak.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class promo {
    @Id
    private String anneePromo ;
    private String num_reçus ;
    private String num_inscrit ;

    @OneToMany(mappedBy ="promo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<etudiant> etudiants;
    @ManyToOne
    @JoinColumn(name = "numProf")
    private prof  prof;


}
