package com.example.projet_jee.repositories;

import com.example.projet_jee.entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Integer> {
}
