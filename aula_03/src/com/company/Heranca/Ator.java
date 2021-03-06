package com.company.Heranca;

import com.company.Dominio.Genero;
import com.company.Dominio.Pessoa;

public class Ator extends Pessoa {
    private int quantidadeOscarsVencidos;

    public Ator(String nome, int idade, int quantidadeOscarsVencidos, Genero genero) {
        super(nome, idade, genero);
        this.quantidadeOscarsVencidos = quantidadeOscarsVencidos;
    }

}
