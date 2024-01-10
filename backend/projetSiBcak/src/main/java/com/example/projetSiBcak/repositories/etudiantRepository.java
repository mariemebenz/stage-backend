package com.example.projetSiBcak.repositories;


import com.example.projetSiBcak.models.etudiant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface etudiantRepository  extends JpaRepository<etudiant,Long> {
    etudiant getEtudiantByCodeEtudiant(Long codeEtudiant);
}
