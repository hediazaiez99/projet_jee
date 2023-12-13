package com.example.projet_jee.services;



import com.example.projet_jee.entity.Departement;

import java.util.List;

public interface IDepartementService {
    List<Departement> retrieveAllDepartements();
    Departement addDepartement(Departement d);
    Departement updateDepartement(Departement d);
    Departement retrieveDepartement(Integer idDepart);
    public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite);
    void deleteDepartement(Integer idDepart);


}
