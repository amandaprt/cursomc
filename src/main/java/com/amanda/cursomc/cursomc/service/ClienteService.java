package com.amanda.cursomc.cursomc.service;

import com.amanda.cursomc.cursomc.domain.Cliente;
import com.amanda.cursomc.cursomc.exception.ObjectNotFoundException;
import com.amanda.cursomc.cursomc.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente buscar(Integer id){

        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado"));

    }

}
