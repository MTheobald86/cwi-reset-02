package Filmes;

public enum Genero {
    MASCULINO ("masculino"),
    FEMININO ("feminino"),
    NAO_BINARIO ("não binário");

    private String descricao;

    Genero(String descricao) {
        this.descricao = descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}


