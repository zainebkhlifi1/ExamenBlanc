package com.example.khlifizainebexblanc.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity

public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idClient;
    String identifiant;
    LocalDate datePremiereVisite;

}
