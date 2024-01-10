package com.example.projetSiBcak.repositories;


import com.example.projetSiBcak.models.competence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface competenceRepository  extends JpaRepository<competence,String> {
}
