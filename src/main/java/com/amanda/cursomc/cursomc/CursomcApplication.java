package com.amanda.cursomc.cursomc;

import com.amanda.cursomc.cursomc.domain.*;
import com.amanda.cursomc.cursomc.enums.TipoCliente;
import com.amanda.cursomc.cursomc.repository.*;
import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	CategoriaRepository categoriaRepository;

	@Autowired
    ProdutoRepository produtoRepository;

	@Autowired
    EstadoRepository estadoRepository;

	@Autowired
    CidadeRepository cidadeRepository;

	@Autowired
    ClienteRepository clienteRepository;

	@Autowired
    EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");

		Produto p1 = new Produto(null, "computador", 2000.00);
        Produto p2 = new Produto(null, "impressora", 800.00);
        Produto p3 = new Produto(null, "mouse", 80.00);

        cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
        cat2.getProdutos().addAll(Arrays.asList(p2));

        p1.getCategorias().addAll(Arrays.asList(cat1));
        p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
        p3.getCategorias().addAll(Arrays.asList(cat1));

        Estado sao_paulo = new Estado(null, "São Paulo");
        Estado minas_gerais = new Estado(null, "Minas Gerais");

        Cidade campinas = new Cidade(null, "Campinas", sao_paulo);
        Cidade saoPaulo = new Cidade(null, "São Paulo", sao_paulo);
        Cidade uberlandia = new Cidade(null, "Uberlandia", minas_gerais);

        sao_paulo.getCidade().addAll(Arrays.asList(campinas, saoPaulo));
        minas_gerais.getCidade().addAll(Arrays.asList(uberlandia));

        Cliente cliente = new Cliente(null, "Maria Silva", "maria@gmail.com", "123123", TipoCliente.PESSOAFISICA);
        cliente.getTelefone().addAll(Arrays.asList("2323545", "123123"));
        Endereco endereco1 = new Endereco(null, "rua tal", "899", "casa", "sadasd", "123230", cliente, campinas);
        Endereco endereco2 = new Endereco(null, "rua tal", "899", "casa", "sadasd", "123230", cliente, saoPaulo);

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		estadoRepository.saveAll(Arrays.asList(sao_paulo, minas_gerais));
		cidadeRepository.saveAll(Arrays.asList(campinas, saoPaulo, uberlandia));
		clienteRepository.save(cliente);
		enderecoRepository.saveAll(Arrays.asList(endereco1, endereco2));




	}
}
