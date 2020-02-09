package com.amanda.cursomc.cursomc.repository;

import com.amanda.cursomc.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
