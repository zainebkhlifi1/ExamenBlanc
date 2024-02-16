package com.example.khlifizainebexblanc.services;

import com.example.khlifizainebexblanc.entities.CarteFid;
import com.example.khlifizainebexblanc.entities.Client;
import com.example.khlifizainebexblanc.entities.Magasin;

import java.util.List;

public interface IServices {
    Client ajouterClient(Client c);
    Magasin ajouterMagasinEtPersonnel(Magasin magasin);
    void affecterClientAMagain(int idClient,int idMagasin);
    void ajouterCarteEtAffecterClient(CarteFid carteFid,long cin);
    long effecterOperation(String typeOperation,long numCarte,int montant);
    List<Client> afficherClients(String nomMagasin);
    void totalSolde();


}
