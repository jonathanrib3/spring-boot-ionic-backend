package com.example.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>  {
	
}

