package com.example.projetSiBcak.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class stage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long numStage;
    @ManyToOne
    @JoinColumn(name = "codeEtudiant")
    private etudiant etudiant;
    @ManyToOne
    @JoinColumn(name = "numProf")
    private prof prof;


    @ManyToOne
    @JoinColumn(name = "N_siret")
    private entreprise entreprise;



    @ManyToOne
    @JoinColumn(name = "numTuteur")
    private tuteur tuteur;
    @ManyToOne
    @JoinColumn(name = "codeT")
    private typeStage  typestage;

    @ManyToOne
    @JoinColumn(name = "annee")
    private annee annee;

    public Long getNumStage() {
        return numStage;
    }




    public void setNumStage(Long numStage) {
        this.numStage = numStage;
    }

    public com.example.projetSiBcak.models.etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(com.example.projetSiBcak.models.etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public com.example.projetSiBcak.models.prof getProf() {
        return prof;
    }

    public void setProf(com.example.projetSiBcak.models.prof prof) {
        this.prof = prof;
    }

    public com.example.projetSiBcak.models.entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(com.example.projetSiBcak.models.entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public com.example.projetSiBcak.models.tuteur getTuteur() {
        return tuteur;
    }

    public void setTuteur(com.example.projetSiBcak.models.tuteur tuteur) {
        this.tuteur = tuteur;
    }

    public typeStage getTypestage() {
        return typestage;
    }

    public void setTypestage(typeStage typestage) {
        this.typestage = typestage;
    }

    public com.example.projetSiBcak.models.annee getAnnee() {
        return annee;
    }

    public void setAnnee(com.example.projetSiBcak.models.annee annee) {
        this.annee = annee;
    }

    public stage( com.example.projetSiBcak.models.etudiant etudiant, com.example.projetSiBcak.models.prof prof, com.example.projetSiBcak.models.entreprise entreprise, com.example.projetSiBcak.models.tuteur tuteur, typeStage typestage, com.example.projetSiBcak.models.annee annee) {

        this.etudiant = etudiant;
        this.prof = prof;
        this.entreprise = entreprise;
        this.tuteur = tuteur;
        this.typestage = typestage;
        this.annee = annee;
    }

    public stage() {
    }

    public stage(Long numStage, com.example.projetSiBcak.models.etudiant etudiant, com.example.projetSiBcak.models.prof prof, com.example.projetSiBcak.models.entreprise entreprise, com.example.projetSiBcak.models.tuteur tuteur, typeStage typestage, com.example.projetSiBcak.models.annee annee) {
        this.numStage = numStage;
        this.etudiant = etudiant;
        this.prof = prof;
        this.entreprise = entreprise;
        this.tuteur = tuteur;
        this.typestage = typestage;
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "stage{" +
                "numStage=" + numStage +
                ", etudiant=" + etudiant +
                ", prof=" + prof +
                ", entreprise=" + entreprise +
                ", tuteur=" + tuteur +
                ", typestage=" + typestage +
                ", annee=" + annee +
                '}';
    }
}
