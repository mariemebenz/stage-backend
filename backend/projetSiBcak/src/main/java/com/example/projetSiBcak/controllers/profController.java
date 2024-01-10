package com.example.projetSiBcak.controllers;

import com.example.projetSiBcak.models.*;
import com.example.projetSiBcak.services.profService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "prof/order")
public class profController {
    private profService service ;
    @Autowired

    public profController(profService service) {
        this.service=service;
    }
    //respo
    @PostMapping("/fixerDate")
    public void fixerDate(@RequestBody Associer as) {
        service.FixerDateStage(as);
    }
    @PostMapping("/fixerCompetence")
    public void fixerCompetence(@RequestBody competence c) {

        service.FixerCompetence(c);
    }


    @PostMapping("/fixerAcquerir")
    public void fixeAcquerir(@RequestBody Acquerir a) {
        service.FixerAcquerir(a);
    }
    @PostMapping("/ajouterStage/{numProf}/{codeEtudiant}/{nsiret}/{numTuteur}/{codet}/{ann}")
    public void ajouterStage(@RequestBody stage  s,@PathVariable Long numProf,@PathVariable Long codeEtudiant,@PathVariable String nsiret,@PathVariable Long numTuteur,@PathVariable String codet,@PathVariable String ann) {
        service.ajouterStage(s,numProf,codeEtudiant,nsiret,numTuteur,codet,ann);
    }
    @PostMapping("/ajouterTuteur/{N_siret}")
    public void ajouterTuteur(@RequestBody tuteur t,@PathVariable String N_siret) {
        service.ajouterTuteur(t,N_siret);
    }
    @PostMapping("/ajouterEntreprise")
    public void ajouterEntreprise(@RequestBody entreprise e) {
        service.ajouterEntreprise(e);
    }

}
