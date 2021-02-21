package com.company.Dominio;

public class Editora {
    private String nome;
    private String localizacao;


    public Editora(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public void verificaNome(String nome){
        if ("DC Comics".equals(nome)){
           throw new  RuntimeException ("Jarvis avisa: Essa editora não pode ser instanciada. Repense seus conceitos " +
                   "e retorne mais tarde");
        }
    }

    public void apresentaEditora(){
        System.out.println(this.getNome(), this.getLocalizacao());
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }
}
