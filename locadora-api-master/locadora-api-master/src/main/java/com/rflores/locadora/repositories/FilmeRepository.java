package com.rflores.locadora.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rflores.locadora.domain.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer>{
    
}
