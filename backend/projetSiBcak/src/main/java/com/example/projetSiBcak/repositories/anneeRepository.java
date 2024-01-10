package com.example.projetSiBcak.repositories;


import com.example.projetSiBcak.models.annee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface anneeRepository extends JpaRepository<annee,String> {

    annee  getAnneeByAnnee(String annee);
}
