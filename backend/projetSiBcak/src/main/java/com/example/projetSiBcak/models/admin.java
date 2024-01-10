package com.example.projetSiBcak.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class admin {
    @Id
    private String email;
    private String pass;
}
