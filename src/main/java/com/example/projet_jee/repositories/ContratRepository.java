package com.example.projet_jee.repositories;

import com.example.projet_jee.entity.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.Date;
import java.util.List;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Integer> {



    List<Contrat> findByEtudiantIdEtudiant(Integer idEtudiant);

}
