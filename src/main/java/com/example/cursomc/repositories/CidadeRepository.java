package com.example.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>  {
	
}
