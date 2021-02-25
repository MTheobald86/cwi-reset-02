package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.utilitarios.InstituicaoBancaria;
import br.com.banco.desgraca.domain.utilitarios.TipoConta;
import br.com.banco.desgraca.exception.TipoContaInvalidoException;
import br.com.banco.desgraca.exception.ValorInvalidoException;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class ContaPoupanca extends Contas{
    private static final double TAXA_SAQUE = 1.02;
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
        if (valor >= 50) {
            super.sacar(valor * TAXA_SAQUE);
        }else{
            throw new ValorInvalidoException();
        }

    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        double valorComtaxa = valor;
        if (getInstituicaoBancaria().equals(contaDestino.getInstituicaoBancaria())) {
            valorComtaxa = (valor - (valor * TAXA_TRANSFERENCIA_MESMO_BANCO));
            super.transferir(valor, contaDestino);
            sacar(valorComtaxa);
        }else{
            valorComtaxa = (valor - (valor * TAXA_TRANFERENCIA_OUTRO_BANCO));
            super.transferir(valor, contaDestino);
            sacar(valorComtaxa);
        }
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
