package com.example.projetSiBcak.repositories;


import com.example.projetSiBcak.models.entreprise;
import com.example.projetSiBcak.models.tuteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tuteurRepository  extends JpaRepository<tuteur,String> {

    tuteur getTuteurByNumTuteur(Long numTuteur);
}
