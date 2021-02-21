package com.company.Dominio;

public class Editora {
    private String nome;
    private String localizacao;


    public Editora(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        verificaNome(nome);
    }

    private void verificaNome(String nome){
        if (nome.equals("DC Comics")){
           throw new  RuntimeException ("Jarvis avisa: Essa editora não pode ser instanciada. Repense seus conceitos " +
                   "e retorne mais tarde");
        }
    }

    public void apresentaEditora(){
        System.out.println(this.nome + "-" + this.localizacao);
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }
}
