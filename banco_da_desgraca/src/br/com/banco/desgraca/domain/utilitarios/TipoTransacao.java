package br.com.banco.desgraca.domain.utilitarios;

public enum TipoTransacao {
    ENTRADA ("+"),
    SAIDA ("-");

    private String sinal;

    TipoTransacao(String sinal) {
        this.sinal = sinal;
    }

    public String getSinal() {
        return sinal;
    }


}
