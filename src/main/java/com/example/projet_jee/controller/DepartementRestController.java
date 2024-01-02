package com.example.projet_jee.controller;

import com.example.projet_jee.services.IDepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.projet_jee.entity.Departement;

import java.util.List;

@RestController
@RequestMapping("/departement")

public class DepartementRestController {
    @Autowired
    IDepartementService departementService;
    // http://localhost:8089/projetjee/departement/retrieve-all-departements
    @GetMapping("/retrieve-all-departements")
    @ResponseBody
    public List<Departement> getDepartements() {
        List<Departement> listDepartements = departementService.retrieveAllDepartements();
        return listDepartements;
    }

    // http://localhost:8089/projetjee/departement/retrieve-departement/8
    @GetMapping("/retrieve-departement/{departement-id}")
    @ResponseBody
    public Departement retrieveDepartement(@PathVariable("departement-id") Integer departementId) {
        return departementService.retrieveDepartement(departementId);
    }

    // http://localhost:8089/projetjee/departement/add-departement
    @PostMapping("/add-departement")
    @ResponseBody
    public Departement addDepartement(@RequestBody Departement d) {
        departementService.addDepartement(d);
        return d;
    }

    // http://localhost:8089/projetjee/departement/update-departement
    @PutMapping("/update-departement")
    @ResponseBody
    public Departement updateDepartement(@RequestBody Departement departement) {
        Departement d= departementService.updateDepartement(departement);
        return d;
    }



    // http://localhost:8089/projetjee/departement/retrieveDepartementsByUniversite/1
    @GetMapping("/retrieveDepartementsByUniversite/{idUniversite}")
    @ResponseBody
    public List<Departement> retrieveDepartementsByUniversite(@PathVariable("idUniversite") Integer idUniversite) {
        List<Departement> listDepartements = departementService.retrieveDepartementsByUniversite(idUniversite);
        return listDepartements;
    }


}
