package com.example.projetSiBcak.repositories;


import com.example.projetSiBcak.models.prof;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface profRepository  extends JpaRepository<prof,Long> {

    prof getProfByNumProf(Long numProf);
}
