package com.example.khlifizainebexblanc.controller;

import com.example.khlifizainebexblanc.entities.Magasin;
import com.example.khlifizainebexblanc.services.IServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("magasin")
@AllArgsConstructor
public class MagasinController {
    IServices services;
    @PostMapping("add")
    public ResponseEntity<Magasin> ajouterMagasin(@RequestBody Magasin magasin) {
        Magasin savedMagasin = services.ajouterMagasinEtPersonnel(magasin);
        return new ResponseEntity<>(savedMagasin, HttpStatus.CREATED);
    }

}
