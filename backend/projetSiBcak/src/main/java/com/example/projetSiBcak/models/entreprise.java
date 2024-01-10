package com.example.projetSiBcak.models;
import jakarta.persistence.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
import java.util.List;


@Entity
@Table
public class entreprise {
    @Id
    private String N_siret;

    private String forme;
    private String raison;
    private String adresse;
    private String ville;
    private String tel;
    @OneToMany(mappedBy = "entreprise", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<tuteur>  tuteurs;

    public void setStage(List<com.example.projetSiBcak.models.stage> stage) {
        this.stage = stage;
    }
    public entreprise() {
    }

    public entreprise( String forme, String raison, String adresse, String ville, String tel) {

        this.forme = forme;
        this.raison = raison;
        this.adresse = adresse;
        this.ville = ville;
        this.tel = tel;

    }

    public entreprise(String n_siret, String forme, String raison, String adresse, String ville, String tel) {
        N_siret = n_siret;
        this.forme = forme;
        this.raison = raison;
        this.adresse = adresse;
        this.ville = ville;
        this.tel = tel;

    }

    public entreprise(String n_siret, String forme, String raison, String adresse, String ville, String tel, List<tuteur> tuteurs) {
        N_siret = n_siret;
        this.forme = forme;
        this.raison = raison;
        this.adresse = adresse;
        this.ville = ville;
        this.tel = tel;
        this.tuteurs = tuteurs;
    }

    @Override
    public String toString() {
        return "entreprise{" +
                "N_siret='" + N_siret + '\'' +
                ", forme='" + forme + '\'' +
                ", raison='" + raison + '\'' +
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                ", tel='" + tel + '\'' +
                ", tuteurs=" + tuteurs +
                '}';
    }

    public String getN_siret() {
        return N_siret;
    }

    public void setN_siret(String n_siret) {
        N_siret = n_siret;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public String getRaison() {
        return raison;
    }

    public void setRaison(String raison) {
        this.raison = raison;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<tuteur> getTuteurs() {
        return tuteurs;
    }

    public void setTuteurs(List<tuteur> tuteurs) {
        this.tuteurs = tuteurs;
    }
    @OneToMany(mappedBy = "entreprise", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<stage> stage;
}



