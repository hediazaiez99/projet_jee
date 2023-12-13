package com.example.projet_jee.repositories;

import com.example.projet_jee.entity.Etudiant;
import com.example.projet_jee.entity.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {





    List<Etudiant> findByDepartementIdDepartement(Integer idDepartement);

   List<Etudiant> findByEquipesNiveau(Niveau niveau);

   Etudiant findByNomEAndPrenomE(String nomE, String prenomE);











}
