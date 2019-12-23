package com.amanda.cursomc.cursomc.resource;

import com.amanda.cursomc.cursomc.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> teste(){
        Categoria categoria = new Categoria(1, "Caneta");
        Categoria categoria1 = new Categoria(2, "lápis");

        List<Categoria> listaCategoria = new ArrayList<>();
        listaCategoria.add(categoria);
        listaCategoria.add(categoria1);

        return listaCategoria;


    }
}
