package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.utilitarios.*;
import br.com.banco.desgraca.exception.SaldoInsuficienteException;
import br.com.banco.desgraca.exception.ValorInvalidoException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Contas implements ContaBancaria {
    private InstituicaoBancaria instituicaoBancaria;
    private Integer numeroConta;
    private TipoConta tipoConta;
    private double saldo;


    List<Transacao>operacoes = new ArrayList<>();


    public Contas(InstituicaoBancaria instituicaoBancaria, Integer numeroConta, TipoConta tipoConta, double saldo) {
        this.instituicaoBancaria = instituicaoBancaria;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public abstract String dadosDaconta ();

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return this.instituicaoBancaria;
    }

    @Override
    public Double consultarSaldo() {
        return this.saldo;
    }

    @Override
    public void depositar(Double valor) {
        LocalDate data = Data.getDataTransacao();
        if (valor <= 0){
            throw new ValorInvalidoException();

        }else {
            saldo += valor;
            System.out.println("Depositando " + DecimalFormat.getCurrencyInstance().format(valor) + " em " + dadosDaconta());
            operacoes.add(new Transacao(TipoTransacao.ENTRADA, valor, data, numeroConta));
        }

    }

    @Override
    public void sacar(Double valor) {
        LocalDate data = Data.getDataTransacao();
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Retirando " + DecimalFormat.getCurrencyInstance().format(valor) + " de " +
                    dadosDaconta());
            operacoes.add(new Transacao(TipoTransacao.SAIDA, valor, data, numeroConta));
        }else{
            throw new SaldoInsuficienteException();
        }

    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        LocalDate data = Data.getDataTransacao();
        if (valor > saldo){
            throw new SaldoInsuficienteException();
        }else if (valor <= 0){
            throw new ValorInvalidoException();
        }else{
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferindo " + DecimalFormat.getCurrencyInstance().format(valor)+ " de "
                    + dadosDaconta()+ " para " + contaDestino.toString());
            operacoes.add(new Transacao(TipoTransacao.SAIDA, valor, data, numeroConta));
        }
    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {
        System.out.println(dadosDaconta());
        System.out.println("------------------");
        for (Transacao t : operacoes){
            if (t.getNumeroConta().equals(numeroConta)){
                if (t.getDataDaTransacao().compareTo(inicio)>=0 && t.getDataDaTransacao().compareTo(fim)<=0){
                    System.out.println(t.getDataDaTransacao()+ "  " + t.getTipoTransacao().getSinal() + "  " +
                            DecimalFormat.getCurrencyInstance().format(t.getValorTransacao()));
                }
            }
        }
    }

    @Override
    public String toString() {
        return dadosDaconta();
    }

    public InstituicaoBancaria getIstituicaoBancaria() {
        return instituicaoBancaria;
    }

    public void setInstituicaoBancaria(InstituicaoBancaria instituicaoBancaria) {
        this.instituicaoBancaria = instituicaoBancaria;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}


