package com.amanda.cursomc.cursomc.service;

import com.amanda.cursomc.cursomc.domain.Categoria;
import com.amanda.cursomc.cursomc.exception.ObjectNotFoundException;
import com.amanda.cursomc.cursomc.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    public Categoria buscar(Integer id){

        Optional<Categoria> categoria = categoriaRepository.findById(id);
        return categoria.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
