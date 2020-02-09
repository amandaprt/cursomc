package com.amanda.cursomc.cursomc.resource;

import com.amanda.cursomc.cursomc.domain.Categoria;
import com.amanda.cursomc.cursomc.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @Autowired
    CategoriaService categoriaService;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<Categoria> buscaCategoria(@PathVariable Integer id){

        Categoria categoria = categoriaService.buscar(id);

        return ResponseEntity.ok().body(categoria);

    }
}
