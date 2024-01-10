package com.example.projetSiBcak.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table
@IdClass(AssocierId.class)
public class Associer  {
    @Id
    @ManyToOne
    @JoinColumn(name = "annee")
    private  annee annee;

    @Id
    @ManyToOne
    @JoinColumn(name = "codet")
    private typeStage typestage;

    private Date  date_deb;
    private Date date_fin;



}
