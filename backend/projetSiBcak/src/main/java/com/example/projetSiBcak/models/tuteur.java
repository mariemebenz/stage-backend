package com.example.projetSiBcak.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table
public class tuteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // or another suitable strategy
    private Long numTuteur;

    private String nom;
    private String prenom;
    private String tel;
    @ManyToOne
    @JoinColumn(name = "N_siret")
    private entreprise entreprise;
    @OneToMany(mappedBy = "tuteur", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<stage> stage;

    public Long getNumTuteur() {
        return numTuteur;
    }

    public tuteur() {
    }

    public void setNumTuteur(Long numTuteur) {
        this.numTuteur = numTuteur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public com.example.projetSiBcak.models.entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(com.example.projetSiBcak.models.entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public List<com.example.projetSiBcak.models.stage> getStage() {
        return stage;
    }

    public void setStage(List<com.example.projetSiBcak.models.stage> stage) {
        this.stage = stage;
    }



    public tuteur( String nom, String prenom, String tel, com.example.projetSiBcak.models.entreprise entreprise) {
        this.numTuteur = numTuteur;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.entreprise = entreprise;
        this.stage = stage;
    }

    public tuteur(Long numTuteur, String nom, String prenom, String tel, com.example.projetSiBcak.models.entreprise entreprise) {
        this.numTuteur = numTuteur;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.entreprise = entreprise;
        this.stage = stage;
    }

    public tuteur(Long numTuteur, String nom, String prenom, String tel, com.example.projetSiBcak.models.entreprise entreprise, List<com.example.projetSiBcak.models.stage> stage) {
        this.numTuteur = numTuteur;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.entreprise = entreprise;
        this.stage = stage;
    }
}
