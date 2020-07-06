package com.example.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursomc.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer>  {
	
}