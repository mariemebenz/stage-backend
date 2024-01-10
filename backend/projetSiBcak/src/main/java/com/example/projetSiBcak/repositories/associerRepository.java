package com.example.projetSiBcak.repositories;


import com.example.projetSiBcak.models.Associer;
import com.example.projetSiBcak.models.AssocierId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface associerRepository  extends JpaRepository<Associer, AssocierId> {

}
