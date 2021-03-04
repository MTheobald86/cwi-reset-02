package br.com.banco.desgraca.domain.utilitarios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transacao {
    private TipoTransacao tipoTransacao;
    private Double valorTransacao;
    private LocalDate dataDaTransacao;
    private Integer numeroConta;
    private List<Transacao> operacoes;

    public Transacao(TipoTransacao tipoTransacao, Double valorTransacao, LocalDate dataDaTransacao, Integer numeroConta) {
        this.tipoTransacao = tipoTransacao;
        this.valorTransacao = valorTransacao;
        this.dataDaTransacao = dataDaTransacao;
        this.numeroConta = numeroConta;
    }

    public void transacao(){
      operacoes = new ArrayList<>();
    }

    public List<Transacao> getOperacoes() {
        return operacoes;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public Double getValorTransacao() {
        return valorTransacao;
    }

    public LocalDate getDataDaTransacao() {
        return dataDaTransacao;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }
}
