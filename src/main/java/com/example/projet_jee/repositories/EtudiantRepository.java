package com.example.projet_jee.repositories;

import com.example.projet_jee.entity.Etudiant;
import com.example.projet_jee.entity.Niveau;
import com.example.projet_jee.entity.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {





    List<Etudiant> findByDepartementIdDepartement(Integer idDepartement);

   List<Etudiant> findByEquipesNiveau(Niveau niveau);

   Etudiant findByNomEAndPrenomE(String nomE, String prenomE);


    @Query("SELECT e FROM Etudiant e, Contrat c where "
            + "e.idEtudiant = c.etudiant.idEtudiant "
            + "and c.specialite =:specialite ")
    List<Etudiant> retrieveEtudiantsByContratSpecialite(@Param("specialite") Specialite specialite);

    //  @Query(value = "SELECT * FROM etudiant e INNER JOIN contrat c ON e.id_etudiant =   c.etudiant_id_etudiant where c.specialite = :specialite", nativeQuery = true)
    // List<Etudiant> retrieveEtudiantsByContratSpecialiteSQL(@Param("specialite") Specialite specialite);
    @Query(value = "SELECT * FROM etudiant e INNER JOIN contrat c ON e.id_etudiant =   c.etudiant_id_etudiant where c.specialite =:specialite", nativeQuery = true)
    List<Etudiant> retrieveEtudiantsByContratSpecialiteSQL(@Param("specialite") String specialite);

}
