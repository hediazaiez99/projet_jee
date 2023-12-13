package com.example.projet_jee.repositories;

import com.example.projet_jee.entity.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EquipeRepository  extends JpaRepository<Equipe, Integer> {
    

}
