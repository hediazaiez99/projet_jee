package com.example.projet_jee.services;

import com.example.projet_jee.entity.Departement;
import com.example.projet_jee.entity.Universite;
import com.example.projet_jee.repositories.DepartementRepository;
import com.example.projet_jee.repositories.UniversiteRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Slf4j
public class UniversiteServiceImpl implements  IUniversiteService{
    @Autowired
    UniversiteRepository universiteRepository;
    @Autowired
    DepartementRepository departementRepository;
    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        log.debug("u :"+u.getNomUniv());
        universiteRepository.save(u);
        return u;
    }

    @Override
    public Universite updateUniversite(Universite u) {
        universiteRepository.save(u);
        return u;
    }

    @Override
    public Universite retrieveUniversite(Integer idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    @Transactional
    public void assignUniversiteToDepartement(Integer universiteId, Integer departementId) {
        Universite universite =universiteRepository.findById(universiteId).get();
        Departement departement=departementRepository.findById(departementId).get();
        universite.getDepartements().add(departement);
        log.info("departements number "+universite.getDepartements().size());
    }
    @Override
    public void deleteUniversite(Integer idUniversite) {
        universiteRepository.deleteById(idUniversite);

    }

}
