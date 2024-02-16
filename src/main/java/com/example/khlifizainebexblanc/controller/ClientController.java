package com.example.khlifizainebexblanc.controller;

import com.example.khlifizainebexblanc.entities.Client;
import com.example.khlifizainebexblanc.services.IServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@AllArgsConstructor
public class ClientController {

    IServices services;
    @PostMapping("/add")
    public ResponseEntity<Client> ajouterClient(@RequestBody Client client) {
        Client savedClient = services.ajouterClient(client);
        return new ResponseEntity<>(savedClient, HttpStatus.CREATED);

    }


}
