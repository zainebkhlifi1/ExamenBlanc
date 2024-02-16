package com.example.khlifizainebexblanc.repositories;

import com.example.khlifizainebexblanc.entities.CarteFid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICarteFidRepository extends JpaRepository<CarteFid,Long> {

    CarteFid findByNumeroCarte(long numCarte);
}
