//Responsável pela camada de acesso a dados da tabela produto
package com.example.cursomc.repositories;

import com.example.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	
}
