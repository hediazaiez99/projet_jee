package com.example.projet_jee.services;

import com.example.projet_jee.entity.Etudiant;
import com.example.projet_jee.entity.Niveau;
import com.example.projet_jee.entity.Specialite;

import java.util.List;

public interface IEtudiantService {

    List<Etudiant> retrieveAllEtudiants();
    Etudiant addEtudiant(Etudiant e);
    Etudiant updateEtudiant(Etudiant e);
    Etudiant retrieveEtudiant(Integer idEtudiant);
    void removeEtudiant(Integer idEtudiant);

    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) ;

    List<Etudiant> findByDepartementIdDepartement(Integer idDepartement);

    List<Etudiant> findByEquipesNiveau(Niveau niveau);

    //JPQL
    List<Etudiant> retrieveEtudiantsByContratSpecialite(Specialite specialite);

    List<Etudiant> retrieveEtudiantsByContratSpecialiteSQL(String specialite);

    Etudiant addAndAssignEtudiantToEquipeAndContract (Etudiant e, Integer idContrat , Integer idEquipe);

    List<Etudiant> getEtudiantsByDepartement (Integer idDepartement);

}
