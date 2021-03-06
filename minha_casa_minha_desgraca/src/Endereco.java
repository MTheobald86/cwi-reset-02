public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private UnidadeFederativa estado;

    public Endereco(String logradouro, int numero, String complemento, String bairro, String cidade, UnidadeFederativa
            estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return logradouro + " " + numero + ", " + complemento + ", " + bairro + "-" + cidade +
                "/" + estado;
    }

    public UnidadeFederativa getEstado() {
        return estado;
    }

}
