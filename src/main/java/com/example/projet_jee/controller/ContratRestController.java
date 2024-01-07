package com.example.projet_jee.controller;

import com.example.projet_jee.entity.Contrat;
import com.example.projet_jee.services.IContratService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratRestController {
    IContratService contratService;

    // http://localhost:8089/projetjee/contrat/retrieve-all-contrats
    @GetMapping("/retrieve-all-contrats")
    @ResponseBody
    public List<Contrat> getContrats() {
        List<Contrat> listContrats = contratService.retrieveAllContrats();
        return listContrats;
    }

    // http://localhost:8089/projetjee/contrat/retrieve-contrat/8
    @GetMapping("/retrieve-contrat/{contrat-id}")
    @ResponseBody
    public Contrat retrieveContrat(@PathVariable("contrat-id") Integer contratId) {
        return contratService.retrieveContrat(contratId);
    }

    // http://localhost:8089/projetjee/contrat/add-contrat
    @PostMapping("/add-contrat")
    @ResponseBody
    public Contrat addContrat(@RequestBody Contrat c) {
        Contrat contrat = contratService.addContrat(c);
        return contrat;
    }

    // http://localhost:8089/projetjee/contrat/update-contrat
    @PutMapping("/update-contrat")
    @ResponseBody
    public Contrat updateEtudiant(@RequestBody Contrat cont) {
        Contrat c= contratService.updateContrat(cont);
        return c;
    }

    // http://localhost:8089/projetjee/contrat/addAndAffectContratToEtudiant/salah/ahmed
    @PostMapping("/addAndAffectContratToEtudiant/{nomE}/{prenomE}")
    @ResponseBody
    public Contrat addAndAffectContratToEtudiant(@RequestBody Contrat contrat,@PathVariable("nomE") String nomE,@PathVariable("prenomE") String prenomE) {
        Contrat c= contratService.addAndAffectContratToEtudiant(contrat,nomE,prenomE);
        return c;
    }

    //The most common ISO Date Format yyyy-MM-dd — for example, "2000-10-31".






}
