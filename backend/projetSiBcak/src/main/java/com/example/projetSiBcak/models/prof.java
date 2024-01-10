package com.example.projetSiBcak.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
import java.util.List;

@CrossOrigin
@Entity
@Table
public class prof {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   numProf;
    private String nom;
    private String prenom;
    private String ville;
    private String adresse;

    private String teldOM;
    private String telEcol;

    private String date_E;

    public prof( String nom, String prenom, String ville, String adresse, String teldOM, String telEcol, String date_E, String date_D, List<promo> promos, List<com.example.projetSiBcak.models.stage> stage) {

        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.adresse = adresse;
        this.teldOM = teldOM;
        this.telEcol = telEcol;
        this.date_E = date_E;
        this.date_D = date_D;
        this.promos = promos;
        this.stage = stage;
    }

    public prof() {
    }

    @Override
    public String toString() {
        return "prof{" +
                "numProf=" + numProf +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", ville='" + ville + '\'' +
                ", adresse='" + adresse + '\'' +
                ", teldOM='" + teldOM + '\'' +
                ", telEcol='" + telEcol + '\'' +
                ", date_E=" + date_E +
                ", date_D=" + date_D +
                ", promos=" + promos +
                ", stage=" + stage +
                '}';
    }

    private String date_D;
    @OneToMany(mappedBy = "prof", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<promo> promos;
    @OneToMany(mappedBy = "prof", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<stage> stage;


    public Long getNumProf() {
        return numProf;
    }

    public void setNumProf(Long  numProf) {
        this.numProf = numProf;
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

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTeldOM() {
        return teldOM;
    }

    public void setTeldOM(String teldOM) {
        this.teldOM = teldOM;
    }

    public String getTelEcol() {
        return telEcol;
    }

    public void setTelEcol(String telEcol) {
        this.telEcol = telEcol;
    }



    public String getDate_E() {
        return date_E;
    }

    public void setDate_E(String date_E) {
        this.date_E = date_E;
    }

    public String getDate_D() {
        return date_D;
    }

    public void setDate_D(String date_D) {
        this.date_D = date_D;
    }

    public List<promo> getPromos() {
        return promos;
    }

    public void setPromos(List<promo> promos) {
        this.promos = promos;
    }



    public void setStage(List<com.example.projetSiBcak.models.stage> stage) {
        this.stage = stage;
    }
}
