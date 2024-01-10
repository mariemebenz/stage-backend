package com.example.projetSiBcak.models;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table

@IdClass(AcquerirId.class)
public class Acquerir  {

    @Id
    @ManyToOne
    @JoinColumn(name = "codet")
    private typeStage typestage;

    @Id
    @ManyToOne
    @JoinColumn(name = "codeComp")
    private competence competence;

    private String niveau_exige;

    // Getters and setters
}