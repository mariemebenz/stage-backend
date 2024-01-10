package com.example.projetSiBcak.repositories;

import com.example.projetSiBcak.models.Acquerir;
import com.example.projetSiBcak.models.AcquerirId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface acquerirRepository  extends JpaRepository<Acquerir, AcquerirId> {
}
