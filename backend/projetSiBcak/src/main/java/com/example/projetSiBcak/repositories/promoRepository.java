package com.example.projetSiBcak.repositories;


import com.example.projetSiBcak.models.promo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface promoRepository extends JpaRepository<promo,String> {
}
