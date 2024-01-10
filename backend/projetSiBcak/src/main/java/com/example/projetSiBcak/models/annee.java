package com.example.projetSiBcak.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class annee {
    @Id

    private String annee;
    @OneToMany(mappedBy = "annee")
    private List<Associer> associerss;
    @OneToMany(mappedBy = "annee")
    private List<annee> annees;

    public annee() {
    }

    public annee(String annee, List<Associer> associerss, List<com.example.projetSiBcak.models.annee> annees) {
        this.annee = annee;
        this.associerss = associerss;
        this.annees = annees;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public List<Associer> getAssocierss() {
        return associerss;
    }

    public void setAssocierss(List<Associer> associerss) {
        this.associerss = associerss;
    }

    public List<com.example.projetSiBcak.models.annee> getAnnees() {
        return annees;
    }

    public void setAnnees(List<com.example.projetSiBcak.models.annee> annees) {
        this.annees = annees;
    }
}
