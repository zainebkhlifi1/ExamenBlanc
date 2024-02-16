package com.example.khlifizainebexblanc.repositories;

import com.example.khlifizainebexblanc.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IclientRepository extends JpaRepository<Client,Integer> {

    Client findByCin(long cin);
}
