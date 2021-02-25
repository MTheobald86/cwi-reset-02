package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.utilitarios.InstituicaoBancaria;
import br.com.banco.desgraca.domain.utilitarios.TipoConta;
import br.com.banco.desgraca.exception.TipoContaInvalidoException;
import br.com.banco.desgraca.exception.ValorInvalidoException;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class ContaDigital extends Contas{
    private static final int SAQUE_MINIMO = 10;

    public ContaDigital(InstituicaoBancaria istituicaoBancaria, Integer numeroConta, TipoConta tipoConta, double saldo) {
        super(istituicaoBancaria, numeroConta, tipoConta, saldo);
        if (getInstituicaoBancaria().equals(InstituicaoBancaria.BANCO_DO_BRASIL) ||
                getInstituicaoBancaria().equals(InstituicaoBancaria.BRADESCO) ||
                getInstituicaoBancaria().equals(InstituicaoBancaria.CAIXA)){
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
        if (valor < SAQUE_MINIMO){
            throw new ValorInvalidoException();
        }else {
            super.sacar(valor);
        }
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
