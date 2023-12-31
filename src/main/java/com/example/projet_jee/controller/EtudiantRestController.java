package com.example.projet_jee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.projet_jee.entity.Etudiant;
import com.example.projet_jee.entity.Niveau;
import com.example.projet_jee.entity.Specialite;
import com.example.projet_jee.services.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiant")

public class EtudiantRestController {

    @Autowired
    IEtudiantService etudiantService;
    // http://localhost:8089/projetjee/etudiant/retrieve-all-etudiants
    @GetMapping("/retrieve-all-etudiants")
    @ResponseBody
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();
        return listEtudiants;
    }

    // http://localhost:8089/projetjee/etudiant/retrieve-etudiant/8
    @GetMapping("/retrieve-etudiant/{etudiantId}")
    @ResponseBody
    public Etudiant retrieveContrat(@PathVariable("etudiantId") Integer etudiantId) {
        return etudiantService.retrieveEtudiant(etudiantId);
    }

    // http://localhost:8089/projetjee/etudiant/add-etudiant
    @PostMapping("/add-etudiant")
    @ResponseBody
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant= etudiantService.addEtudiant(e);
        return etudiant;
    }

    // http://localhost:8089/projetjee/etudiant/update-etudiant
    @PutMapping("/update-etudiant")
    @ResponseBody
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant= etudiantService.updateEtudiant(e);
        return etudiant;
    }
    // http://localhost:8089/projetjee/etudiant/removeEtudiant
    @DeleteMapping("/removeEtudiant/{idEtudiant}")
    @ResponseBody
    public void removeEtudiant(@PathVariable("idEtudiant") Integer idEtudiant) {
        etudiantService.removeEtudiant(idEtudiant);
    }

    // http://localhost:8089/projetjee/etudiant/assignEtudiantToDepartement/1/1
    @PutMapping("/assignEtudiantToDepartement/{etudiantId}/{departementId}")
    @ResponseBody
    public void assignEtudiantToDepartement(@PathVariable("etudiantId") Integer etudiantId
            ,@PathVariable("departementId") Integer departementId) {
        etudiantService.assignEtudiantToDepartement(etudiantId,departementId);
    }

    // http://localhost:8089/projetjee/etudiant/findByDepartement/1
    @GetMapping("/findByDepartement/{departement-id}")
    @ResponseBody
    public List<Etudiant> findByDepartement(@PathVariable("departement-id") Integer departementId) {
        return etudiantService.findByDepartementIdDepartement(departementId);
    }

    // http://localhost:8089/projetjee/etudiant/findByEquipesNiveau/JUNIOR
    @GetMapping("/findByEquipesNiveau/{niveau}")
    @ResponseBody
    public List<Etudiant> findByEquipesNiveau(@PathVariable("niveau") Niveau niveau) {
        return etudiantService.findByEquipesNiveau(niveau);
    }

    // http://localhost:8089/projetjee/etudiant/retrieveEtudiantsByContratSpecialite/SECURITE
    @GetMapping("/retrieveEtudiantsByContratSpecialite/{specialite}")
    @ResponseBody
    public List<Etudiant> retrieveEtudiantsByContratSpecialite(@PathVariable("specialite") Specialite specialite) {
        return etudiantService.retrieveEtudiantsByContratSpecialite(specialite);
    }

    // http://localhost:8089/projetjee/etudiant/retrieveEtudiantsByContratSpecialiteSQL/SECURITE
    @GetMapping("/retrieveEtudiantsByContratSpecialiteSQL/{specialite}")
    @ResponseBody
    public List<Etudiant> retrieveEtudiantsByContratSpecialiteSQL(@PathVariable("specialite") String specialite) {
        return etudiantService.retrieveEtudiantsByContratSpecialiteSQL(specialite);
    }

    // http://localhost:8089/projetjee/etudiant/addAndAssignEtudiantToEquipeAndContract/1/1
    @PostMapping("/addAndAssignEtudiantToEquipeAndContract/{equipeId}/{contratId}")
    @ResponseBody
    public void addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant etudiant,@PathVariable("contratId") Integer contratId,@PathVariable("equipeId") Integer equipeId) {
        etudiantService.addAndAssignEtudiantToEquipeAndContract(etudiant,contratId,equipeId);
    }

    // http://localhost:8089/projetjee/etudiant/getEtudiantsByDepartement/1
    @GetMapping("/getEtudiantsByDepartement/{idDepartement}")
    @ResponseBody
    public List<Etudiant> getEtudiantsByDepartement(@PathVariable("idDepartement") Integer idDepartement) {
        return etudiantService.getEtudiantsByDepartement(idDepartement);
    }
}
