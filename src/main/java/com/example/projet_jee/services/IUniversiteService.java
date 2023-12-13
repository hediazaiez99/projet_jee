package com.example.projet_jee.services;



import com.example.projet_jee.entity.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversites();

    Universite addUniversite (Universite  u);

    Universite updateUniversite (Universite  u);

    Universite retrieveUniversite (Integer idUniversite);


    public void assignUniversiteToDepartement(Integer universiteId, Integer departementId) ;
    void deleteUniversite(Integer idUniversite);

}
