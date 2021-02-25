package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.conta.*;
import br.com.banco.desgraca.domain.utilitarios.*;
import br.com.banco.desgraca.exception.*;


public class BancoDaDesgraca {

    public static void main(String[] args) throws Exception {

        ContaCorrente cc0001 = new ContaCorrente(InstituicaoBancaria.ITAU, 0001, TipoConta.CORRENTE, 0.0);
        ContaPoupanca cp1000 = new ContaPoupanca(InstituicaoBancaria.CAIXA,1000, TipoConta.POUPANCA, 100.0);
        ContaDigital cd9000 = new ContaDigital(InstituicaoBancaria.NUBANK, 9000, TipoConta.DIGITAL, 0.0);

        cc0001.depositar(500.0);
        cp1000.depositar(100.0);
        cd9000.depositar(1000.0);



    }
}