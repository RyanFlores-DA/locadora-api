package com.rflores.locadora.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rflores.locadora.domain.Categoria;
import com.rflores.locadora.domain.Filme;
import com.rflores.locadora.repositories.CategoriaRepository;
import com.rflores.locadora.repositories.FilmeRepository;

@Service
public class DBService {
	@Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private FilmeRepository FilmeRepository;

	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Ação", "Filmes de ação");
		Categoria cat2 = new Categoria(null, "Romance", "Filmes de Romance");
		Categoria cat3 = new Categoria(null, "Científico", "Filmes de Ciências");

        Filme f1 = new Filme (null, "Velozes e Lentos", "Robertão", "Lorem ipsum", cat1);
        Filme f2 = new Filme (null, "Amar nunca mais", "Reginaldo Rossi", "Lorem ipsum", cat2);
        Filme f3 = new Filme (null, "Star Warrior", "George Pedro", "Lorem ipsum", cat3);
        Filme f4 = new Filme (null, "Jornada nas areias", "Tom Brady", "Lorem ipsum", cat3);
        Filme f5 = new Filme (null, "Romeu e Ampulheta", "William Fedorento", "Lorem ipsum", cat2);
        
        cat1.getFilmes().addAll(Arrays.asList(f1));
        cat2.getFilmes().addAll(Arrays.asList(f2, f5));
        cat3.getFilmes().addAll(Arrays.asList(f3, f4));
        
        this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        this.FilmeRepository.saveAll(Arrays.asList(f1, f2, f3, f4, f5));
	}
}
