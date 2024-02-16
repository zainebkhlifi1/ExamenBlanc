package com.example.khlifizainebexblanc.controller;

import com.example.khlifizainebexblanc.entities.Client;
import com.example.khlifizainebexblanc.services.Services;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class CarteFidController {

        Services services;
        @PostMapping("effectuerOperation")
        long effectuerOperation(@RequestParam String typeOperation, @RequestParam long numCarte, @RequestParam  int montant) {
            return services.effecterOperation(typeOperation, numCarte, montant);
        }
        @PostMapping("affecterClientAMagasin")
        void affecterClientAMagasin(@RequestParam  int idClient,@RequestParam int idMagasin){
            services.affecterClientAMagain(idClient,idMagasin);
        };
        @PostMapping("afficherClient")
        List<Client> afficherClients(@RequestParam  String nomMagasin){
            return services.afficherClients(nomMagasin);
        }
    }


