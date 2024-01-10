package com.example.projetSiBcak.models;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
import java.util.List;

@CrossOrigin
@Entity
@Table
public class etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  codeEtudiant;

    private String nom;
    private String prenom;
    private String ville;
    private String adresse;
    private String mention;
    private String tel;
    private String date_N;
    @ManyToOne
    @JoinColumn(name = "anneePromo")
    private promo promo;
    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<stage> stage;

    public etudiant(Long codeEtudiant, String nom, String prenom, String ville, String adresse, String mention, String tel, String date_N, com.example.projetSiBcak.models.promo promo, List<com.example.projetSiBcak.models.stage> stage) {
        this.codeEtudiant = codeEtudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.adresse = adresse;
        this.mention = mention;
        this.tel = tel;
        this.date_N = date_N;
        this.promo = promo;
        this.stage = stage;
    }

    public etudiant() {
    }


    public com.example.projetSiBcak.models.promo getPromo() {
        return promo;
    }

    public void setPromo(com.example.projetSiBcak.models.promo promo) {
        this.promo = promo;
    }


    public Long getCodeEtudiant() {
        return codeEtudiant;
    }

    public void setCodeEtudiant(Long codeEtudiant) {
        this.codeEtudiant = codeEtudiant;
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

    public String getMention() {
        return mention;
    }

    public void setMention(String mention) {
        this.mention = mention;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDate_N() {
        return date_N;
    }

    public void setDate_N(String date_N) {
        this.date_N = date_N;
    }
}
