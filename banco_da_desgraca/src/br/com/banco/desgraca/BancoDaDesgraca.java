package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.conta.*;
import br.com.banco.desgraca.domain.utilitarios.*;
import br.com.banco.desgraca.exception.*;

import java.time.LocalDate;


public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        ContaCorrente cc0001 = new ContaCorrente(InstituicaoBancaria.ITAU, 0001, TipoConta.CORRENTE, 0.0);
        ContaPoupanca cp1000 = new ContaPoupanca(InstituicaoBancaria.CAIXA,1000, TipoConta.POUPANCA, 100.0);
        ContaDigital cd9000 = new ContaDigital(InstituicaoBancaria.NUBANK, 9000, TipoConta.DIGITAL, 0.0);

        cc0001.depositar(500.0);
        cp1000.depositar(100.0);
        cd9000.depositar(1000.0);

        cc0001.sacar(20.0);
        cp1000.sacar(50.0);
        cd9000.sacar(150.0);

        cc0001.transferir(100.0, cp1000);
        cp1000.transferir(100.0, cd9000);

        LocalDate data1 = LocalDate.of(2020,01,01);
        LocalDate data2 = LocalDate.of(2021,02,25);
        cc0001.exibirExtrato(data1,data2);




    }
}