package com.example.khlifizainebexblanc.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idClinet ;
    String nomClient;
    String prenomClient;
    String adresseClient;
    @Column(unique = true)
    Long cin;


@ManyToMany
    List<Magasin> magasins=new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    CarteFid carteFid;




}
