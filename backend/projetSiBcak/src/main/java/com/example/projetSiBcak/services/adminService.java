package com.example.projetSiBcak.services;

import com.example.projetSiBcak.models.*;
import com.example.projetSiBcak.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class adminService {
    private adminRepository repository;
    private stageRepository sr;
    private etudiantRepository er;
    private tuteurRepository tr;
    private entrepriseRepository enr;
    private promoRepository  pr;
    private profRepository prf;
    @Autowired
    public adminService(adminRepository repository, stageRepository sr, etudiantRepository er,
                        tuteurRepository tr,entrepriseRepository enr,
                        promoRepository pr,profRepository prf) {
        this.repository = repository;
        this.sr = sr;
        this.er = er;
        this.tr=tr;
        this.enr=enr;
        this.prf=prf;
        this.pr=pr;
    }







    //ajouter promo
    public void ajouterPromo(promo p){
        pr.save(p);
    }
    public void ajouterEtudiant(etudiant e){

             er.save(e);
    }
    public void ajouterProf(prof p){

            prf.save(p)    ;}
}
