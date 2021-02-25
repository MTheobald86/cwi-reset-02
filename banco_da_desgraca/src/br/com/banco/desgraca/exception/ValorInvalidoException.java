package br.com.banco.desgraca.exception;

public class ValorInvalidoException extends RuntimeException{

    public ValorInvalidoException(){
        super ("O valor informado não é válido para essa operação");
    }
}
