package com.amanda.cursomc.cursomc;

import com.amanda.cursomc.cursomc.domain.Produto;

import java.util.Arrays;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        Produto p1 = new Produto(null, "computador", 2000.00);
        Produto p2 = new Produto(null, "impressora", 800.00);
        Produto p3 = new Produto(null, "mouse", 80.00);

        List<Produto> listaProdutos =  Arrays.asList(p1, p2, p3);
        listaProdutos.stream().forEach(listaProduto-> listaProdutos.add(1, p1));

        System.out.println(listaProdutos);
    }
}
