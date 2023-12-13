package com.example.projet_jee.services;

import com.example.projet_jee.entity.Departement;
import com.example.projet_jee.entity.Universite;
import com.example.projet_jee.repositories.DepartementRepository;
import com.example.projet_jee.repositories.UniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DepartementServiceImpl implements IDepartementService{
    @Autowired
    DepartementRepository departementRepository;
    @Autowired
    UniversiteRepository universiteRepository;
    @Override
    public List<Departement> retrieveAllDepartements() {
        return departementRepository.findAll();
    }

    @Override
    public Departement addDepartement(Departement d) {
        departementRepository.save(d);
        return d;
    }

    @Override
    public Departement updateDepartement(Departement d) {
        departementRepository.save(d);
        return d;
    }

    @Override
    public Departement retrieveDepartement(Integer idDepart) {
        return departementRepository.findById(idDepart).get();
    }

    @Override
    public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite) {
        Universite universite = universiteRepository.findById(idUniversite).get();
        return universite.getDepartements();
    }
    @Override
    public void deleteDepartement(Integer idDepart) {
        departementRepository.deleteById(idDepart);

    }
}
