package com.example.projet_jee.repositories;

import com.example.projet_jee.entity.Departement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartementRepository extends JpaRepository<Departement, Integer> {
}
