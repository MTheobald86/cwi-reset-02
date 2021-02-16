import java.text.DecimalFormat;

public class Imovel {

    private Endereco endereco;
    private double valor;

    public Imovel(Endereco endereco, double valor) {
        this.endereco = endereco;
        this.valor = valor;
    }

    public String apresentacao(){
        return   "localizado no endereço " + endereco.toString() + " com valor de R$ " +
                DecimalFormat.getCurrencyInstance().format(valor) + ".";
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }
}
