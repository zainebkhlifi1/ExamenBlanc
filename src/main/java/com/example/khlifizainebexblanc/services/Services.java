package com.example.khlifizainebexblanc.services;
import com.example.khlifizainebexblanc.entities.CarteFid;
import com.example.khlifizainebexblanc.entities.Client;
import com.example.khlifizainebexblanc.entities.Magasin;
import com.example.khlifizainebexblanc.repositories.ICarteFidRepository;
import com.example.khlifizainebexblanc.repositories.IMagasinRepository;
import com.example.khlifizainebexblanc.repositories.IPersonnelRepository;
import com.example.khlifizainebexblanc.repositories.IclientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
@AllArgsConstructor
public class Services implements IServices{
IclientRepository iclientRepository;
ICarteFidRepository iCarteFidRepository;
IMagasinRepository iMagasinRepository;
IPersonnelRepository iPersonnelRepository;

    @Override
    public Client ajouterClient(Client c) {
        return iclientRepository.save(c);
    }

    @Override
    public Magasin ajouterMagasinEtPersonnel(Magasin magasin) {
      return iMagasinRepository.save(magasin);
    }

    @Override
    public void affecterClientAMagain(int idClient, int idMagasin) {

            Client client = iclientRepository.findById(idClient).get();
            Magasin magasin = iMagasinRepository.findById(idMagasin).get();
            client.getMagasins().add(magasin);
            iclientRepository.save(client);
    }

    @Override
    public void  ajouterCarteEtAffecterClient(CarteFid carteFid, long cin) {

        carteFid.setSolde(0L);
        carteFid.setDateCreation(LocalDate.now());
        CarteFid carte = iCarteFidRepository.save(carteFid);
        Client client = iclientRepository.findByCin(cin);
        client.setCarteFid(carte);
        iclientRepository.save(client);

    }

    @Override
    public long effecterOperation(String typeOperation, long numCarte, int montant) {
        {
            CarteFid carteFid = iCarteFidRepository.findByNumeroCarte(numCarte);
            long ancienSolde = carteFid.getSolde();
            long nouveauMontant=0;
            if(typeOperation.equals("+")){
                nouveauMontant = ancienSolde+montant;
                carteFid.setSolde(nouveauMontant);
                iCarteFidRepository.save(carteFid);
                return nouveauMontant;
            }else if (typeOperation.equals("-")){
                nouveauMontant = ancienSolde-montant;
                carteFid.setSolde(nouveauMontant);
                iCarteFidRepository.save(carteFid);
                return nouveauMontant;
            }
            return nouveauMontant;
        }
    }

    @Override
    public List<Client> afficherClients(String nomMagasin) {
        Magasin magasin = iMagasinRepository.findMagasinByNomMagasin(nomMagasin);
        return magasin.getClients();
    }

    @Override
    public void totalSolde() {

        Magasin magasin;
    }
}
