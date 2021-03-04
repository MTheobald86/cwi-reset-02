package br.com.cwi.reset.exemploreset.Domain;

import org.springframework.web.bind.annotation.RestController;
@RestController
public class Usuario {
    private Integer id;
    private String nome;
    private Integer senha;

    public Usuario(String nome, Integer senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }
}
