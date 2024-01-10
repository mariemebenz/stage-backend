package com.example.projetSiBcak.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class competence {

    @Id
    private String codeComp;
    private String libelle;
    private String description;

    public competence() {
    }

    public competence(String codeComp, String libelle, String description) {
        this.codeComp = codeComp;
        this.libelle = libelle;
        this.description = description;

    }

    @Override
    public String toString() {
        return "competence{" +
                "codeComp='" + codeComp + '\'' +
                ", libelle='" + libelle + '\'' +
                ", description='" + description + '\'' +
                ", acquerirs=" + acquerirs +
                '}';
    }

    @OneToMany(mappedBy = "competence")
    private List<Acquerir> acquerirs;

    public String getCodeComp() {
        return codeComp;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getDescription() {
        return description;
    }

    public List<Acquerir> getAcquerirs() {
        return acquerirs;
    }

    public void setCodeComp(String codeComp) {
        this.codeComp = codeComp;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAcquerirs(List<Acquerir> acquerirs) {
        this.acquerirs = acquerirs;
    }

    public competence( String libelle, String description) {

        this.libelle = libelle;
        this.description = description;

    }
}
