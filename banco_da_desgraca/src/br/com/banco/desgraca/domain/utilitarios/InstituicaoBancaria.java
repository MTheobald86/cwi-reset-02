package br.com.banco.desgraca.domain.utilitarios;

public enum InstituicaoBancaria {

    BANCO_DO_BRASIL ("Banco do Brasil"),
    BRADESCO ("Banco Bradesco"),
    CAIXA ("Caixa Econômica Federal"),
    NUBANK ("Banco Nubank"),
    ITAU ("Banco Itau");

    private String nome;

    InstituicaoBancaria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}