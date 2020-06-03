package com.amanda.cursomc.cursomc.resource;

import com.amanda.cursomc.cursomc.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteResource {

    @Autowired
    ClienteService cliente;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public void cliente(@PathVariable Integer id){
        cliente.buscar(id);
    }
}
