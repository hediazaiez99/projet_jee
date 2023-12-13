package com.example.projet_jee.controller;


import com.example.projet_jee.entity.Universite;
import com.example.projet_jee.services.IUniversiteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/universite")

public class UniversiteRestController {
    @Autowired
    IUniversiteService universiteService;

    // http://localhost:8089/projetjee/universite/retrieve-all-universites
    @GetMapping("/retrieve-all-universites")

    @ResponseBody
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = universiteService.retrieveAllUniversites();
        return listUniversites;
    }

    // http://localhost:8089/projetjee/universite/retrieve-universite/8
    @GetMapping("/retrieve-universite/{universite-id}")

    @ResponseBody
    public Universite retrieveUniversite(@PathVariable("universite-id") Integer universiteId) {
        return universiteService.retrieveUniversite(universiteId);
    }

    // http://localhost:8089/projetjee/universite/add-universite
    @PostMapping("/add-universite")

    @ResponseBody
    public Universite addUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.addUniversite(u);
        return universite;
    }

    // http://localhost:8089/projetjee/universite/update-universite
    @PutMapping("/update-universite")

    @ResponseBody
    public Universite updateUniversite(@RequestBody Universite u) {
        Universite universite= universiteService.updateUniversite(u);
        return universite;
    }

    // http://localhost:8089/projetjee/universite/assignUniversiteToDepartement/1/1
    @PutMapping("/assignUniversiteToDepartement/{universiteId}/{departementId}")

    @ResponseBody
    public void assignUniversiteToDepartement(@PathVariable("universiteId") Integer universiteId,@PathVariable("departementId") Integer departementId) {
        universiteService.assignUniversiteToDepartement(universiteId,departementId);
    }
    // http://localhost:8089/projetjee/universite/remove-Universite/1
    @DeleteMapping("/remove-Universite/{Universite-id}")
    public void removeOperateur(@PathVariable("Universite-id") Integer UniversiteId) {
        universiteService.deleteUniversite(UniversiteId);
    }
}
