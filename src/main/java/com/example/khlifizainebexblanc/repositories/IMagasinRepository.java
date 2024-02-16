package com.example.khlifizainebexblanc.repositories;

import com.example.khlifizainebexblanc.entities.Magasin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMagasinRepository extends JpaRepository<Magasin,Integer> {
    Magasin findMagasinByNomMagasin(String nomMagasin);
}
