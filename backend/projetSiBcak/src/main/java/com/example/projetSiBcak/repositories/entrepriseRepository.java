package com.example.projetSiBcak.repositories;


import com.example.projetSiBcak.models.entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface entrepriseRepository extends JpaRepository<entreprise,String> {
   @Query("select e from entreprise e where e.N_siret = ?1")
   entreprise getEntrepriseByN_siret(String N_siret);
}
