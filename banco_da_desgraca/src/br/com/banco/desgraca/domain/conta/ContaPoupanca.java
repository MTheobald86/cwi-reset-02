package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.utilitarios.InstituicaoBancaria;
import br.com.banco.desgraca.domain.utilitarios.TipoConta;
import br.com.banco.desgraca.exception.TipoContaInvalidoException;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class ContaPoupanca extends Contas{
    private static final double TAXA_SAQUE = 0.02;
    private static final double TAXA_TRANFERENCIA_OUTRO_BANCO = 0.01;
    private static final double TAXA_TRANSFERENCIA_MESMO_BANCO = 0.005;


    public ContaPoupanca(InstituicaoBancaria istituicaoBancaria, Integer numeroConta, TipoConta tipoConta, double saldo) {
        super(istituicaoBancaria, numeroConta, tipoConta, saldo);
        if (getInstituicaoBancaria().equals(InstituicaoBancaria.NUBANK)){
            throw new TipoContaInvalidoException();
        }
    }

    @Override
    public InstituicaoBancaria getInstituicaoBancaria() {
        return super.getInstituicaoBancaria();
    }

    @Override
    public Double consultarSaldo() {
        return super.consultarSaldo();
    }

    @Override
    public void depositar(Double valor) {
        super.depositar(valor);
    }

    @Override
    public void sacar(Double valor) {
        super.sacar(valor);
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        super.transferir(valor, contaDestino);
    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {
        super.exibirExtrato(inicio, fim);
    }

    @Override
    public String dadosDaconta() {
        return getInstituicaoBancaria().getNome() + " " + getTipoConta().getTipoConta() + " " + getNumeroConta()
                + " saldo:" + DecimalFormat.getCurrencyInstance().format(getSaldo());
    }
}
