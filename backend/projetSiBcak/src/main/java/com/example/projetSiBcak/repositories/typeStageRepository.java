package com.example.projetSiBcak.repositories;



import com.example.projetSiBcak.models.typeStage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface typeStageRepository extends JpaRepository<typeStage,String> {


    typeStage  getTypeStageByCodet(String codet);
}
