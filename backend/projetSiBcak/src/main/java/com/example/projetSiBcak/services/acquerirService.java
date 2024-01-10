package com.example.projetSiBcak.services;

import com.example.projetSiBcak.repositories.acquerirRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class acquerirService {
    private acquerirRepository repos;
    @Autowired

    public acquerirService(acquerirRepository repos) {
        this.repos = repos;
    }
}
