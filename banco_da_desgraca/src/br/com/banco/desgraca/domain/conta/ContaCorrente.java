package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.utilitarios.InstituicaoBancaria;
import br.com.banco.desgraca.domain.utilitarios.TipoConta;
import br.com.banco.desgraca.exception.ValorInvalidoException;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class ContaCorrente extends Contas{
    private static final double TAXA_TRANSFERENCIA_OUTRO_BANCO = 0.01;



    public ContaCorrente(InstituicaoBancaria instituicaoBancaria, Integer numeroConta, TipoConta tipoConta, double saldo) {
        super(instituicaoBancaria, numeroConta, tipoConta, saldo);
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
        if (valor % 5 == 0) {
            super.sacar(valor);
        }else {
            throw new ValorInvalidoException();
        }
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        if (getInstituicaoBancaria().equals(contaDestino.getInstituicaoBancaria())){
            setSaldo(getSaldo() - valor * TAXA_TRANSFERENCIA_OUTRO_BANCO);
        }else{
        super.transferir(valor, contaDestino);
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
