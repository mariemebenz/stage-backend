package com.example.projetSiBcak.repositories;


import com.example.projetSiBcak.models.stage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface stageRepository  extends JpaRepository<stage,Long> {


}
