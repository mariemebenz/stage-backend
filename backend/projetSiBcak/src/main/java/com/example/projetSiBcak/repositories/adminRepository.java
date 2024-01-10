package com.example.projetSiBcak.repositories;


import com.example.projetSiBcak.models.admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface adminRepository  extends JpaRepository<admin,String> {
    Optional<admin> findAdminByEmail(String email);
}
