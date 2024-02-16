package com.example.khlifizainebexblanc.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CarteFid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idCarte;
    Long numeroCarte;
    Long solde;
    LocalDate dateCreation;

}
