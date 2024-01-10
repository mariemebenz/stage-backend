package com.example.projetSiBcak.services;

import com.example.projetSiBcak.models.*;
import com.example.projetSiBcak.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class profService {
    private  acquerirRepository acr;
    private associerRepository ar;
    private stageRepository sr;
    private etudiantRepository er;
    private tuteurRepository tr;
    private entrepriseRepository enr;
    private promoRepository  pr;
    private competenceRepository cr;

    private typeStageRepository ts;

    private anneeRepository an;
    private profRepository prf;

@Autowired
    public profService(associerRepository ar, stageRepository sr, etudiantRepository er,
                       tuteurRepository tr, entrepriseRepository enr,
                       promoRepository pr,competenceRepository cr,profRepository prf,typeStageRepository ts,anneeRepository an) {
        this.ar = ar;
        this.sr = sr;
        this.er = er;
        this.tr = tr;
        this.enr = enr;
        this.pr = pr;
        this.cr=cr;
        this.prf=prf;
        this.ts=ts;
        this.an=an;
}


//fixer date
  public void  FixerDateStage(Associer a){

            ar.save(a);

    }
    public void  FixerCompetence(competence c){


    cr.save(c);
    }
    public void  FixerAcquerir(Acquerir a){


        acr .save(a);
    }
    public void ajouterStage(stage s,Long numProf,Long codeEtudiant,String nsiret,Long numTuteur,String codeT,String ann){
        try {
        entreprise entreprise = enr. getEntrepriseByN_siret(nsiret);
        prof prof = prf.getProfByNumProf(numProf);
        tuteur tuteur= tr.getTuteurByNumTuteur(numTuteur);
        annee annee = an.getAnneeByAnnee(ann);
        etudiant etudiant=er.getEtudiantByCodeEtudiant(codeEtudiant);
        typeStage typeStage= ts.getTypeStageByCodet(codeT);
        sr.save(s);

        }catch (Exception e) {

            throw new RuntimeException("Erreur lors de l'ajout de stage", e);
        }
    }



    public void ajouterTuteur( tuteur t,String N_siret){
    try {
        entreprise entreprise = enr. getEntrepriseByN_siret(N_siret);
        t.setEntreprise(entreprise);
        tr.save(t);
    }catch (Exception e) {

        throw new RuntimeException("Erreur lors de l'ajout de tuteur", e);
    }
    }
    public void ajouterEntreprise(entreprise en){
        enr.save(en);
    }

}
