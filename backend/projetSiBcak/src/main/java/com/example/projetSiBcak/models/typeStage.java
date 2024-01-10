package com.example.projetSiBcak.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class typeStage {
    @Id
  private String codet;
    private String nbrSemaines;
    @OneToMany(mappedBy = "typestage", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<stage> stage;
    @OneToMany(mappedBy = "typestage")
    private List<Associer> associerss;
  @OneToMany(mappedBy = "typestage")
  private List<Acquerir> acquerirs;

  public typeStage() {

  }

  public String getCodet() {
    return codet;
  }

  public void setCodet(String codet) {
    this.codet = codet;
  }

  public String getNbrSemaines() {
    return nbrSemaines;
  }

  public void setNbrSemaines(String nbrSemaines) {
    this.nbrSemaines = nbrSemaines;
  }

  public List<com.example.projetSiBcak.models.stage> getStage() {
    return stage;
  }

  public void setStage(List<com.example.projetSiBcak.models.stage> stage) {
    this.stage = stage;
  }

  public List<Associer> getAssocierss() {
    return associerss;
  }

  public void setAssocierss(List<Associer> associerss) {
    this.associerss = associerss;
  }

  public List<Acquerir> getAcquerirs() {
    return acquerirs;
  }

  public void setAcquerirs(List<Acquerir> acquerirs) {
    this.acquerirs = acquerirs;
  }

  public typeStage(String codet, String nbrSemaines, List<com.example.projetSiBcak.models.stage> stage, List<Associer> associerss, List<Acquerir> acquerirs) {
    this.codet = codet;
    this.nbrSemaines = nbrSemaines;
    this.stage = stage;
    this.associerss = associerss;
    this.acquerirs = acquerirs;
  }

  @Override
  public String toString() {
    return "typeStage{" +
            "codet='" + codet + '\'' +
            ", nbrSemaines='" + nbrSemaines + '\'' +
            ", stage=" + stage +
            ", associerss=" + associerss +
            ", acquerirs=" + acquerirs +
            '}';
  }
}
