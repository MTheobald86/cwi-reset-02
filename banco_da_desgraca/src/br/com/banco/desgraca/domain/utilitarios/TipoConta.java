package br.com.banco.desgraca.domain.utilitarios;

public enum TipoConta {
    CORRENTE ("conta corrente"),
    POUPANCA ("conta poupança"),
    DIGITAL ("conta digital");

    private String tipoConta;

    TipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }
}
