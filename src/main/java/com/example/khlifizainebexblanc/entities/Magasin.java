package com.example.khlifizainebexblanc.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Magasin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idMagasin;
    String nomMagasin;
    String addressMagasin;
    Long contactMagasin;

    @ManyToMany(mappedBy = "magasins")
    List<Client> clients=new ArrayList<>();

    @OneToOne
    Personnel personnel;

    @OneToMany(mappedBy = "magasins")
    List<Personnel> caissiers=new ArrayList<>();



}
