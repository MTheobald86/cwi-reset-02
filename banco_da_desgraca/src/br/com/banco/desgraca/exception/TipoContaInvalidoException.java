package br.com.banco.desgraca.exception;

public class TipoContaInvalidoException extends RuntimeException{

    public TipoContaInvalidoException(){
        super("Esse banco não possui o tipo de conta desejado");
    }
}
