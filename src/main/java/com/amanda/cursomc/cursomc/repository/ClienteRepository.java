package com.amanda.cursomc.cursomc.repository;

import com.amanda.cursomc.cursomc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
