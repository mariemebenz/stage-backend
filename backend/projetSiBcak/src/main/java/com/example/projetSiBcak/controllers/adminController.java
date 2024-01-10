package com.example.projetSiBcak.controllers;

import com.example.projetSiBcak.models.etudiant;
import com.example.projetSiBcak.models.prof;
import com.example.projetSiBcak.models.promo;
import com.example.projetSiBcak.models.stage;
import com.example.projetSiBcak.services.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping(path = "admin/order")
public class adminController {
    private adminService service;

    @Autowired

    public adminController(adminService service) {
        this.service = service;
    }




    @PostMapping("/ajouterPromo")
    public void ajouterPromo(@RequestBody promo p) {
        service.ajouterPromo(p);
    }
//ajouter etudiant
    @PostMapping("/ajouterEtudiant")
    public void ajouterEtudiants(@RequestBody etudiant e) {
        service.ajouterEtudiant(e);
    }
//ajouter profs
    @PostMapping("/ajouterProf")
    public void ajouterProfs(@RequestBody prof prof)
    {System.out.println(prof);
        service.ajouterProf(prof);
    }
}


