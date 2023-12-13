package com.example.projet_jee.repositories;

import com.example.projet_jee.entity.DetailEquipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DetailEquipeRepository extends JpaRepository<DetailEquipe, Integer> {
}
