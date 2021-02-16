public class Casa extends Imovel{
    private static String tipo = "casa";
    private boolean patio;

    public Casa(Endereco endereco, double valor, String tipo, boolean patio) {
        super(endereco, valor);
        this.tipo = tipo;
        this.patio = patio;
    }



    public static String getTipo() {
        return tipo;
    }

    public boolean isPatio() {
        return patio;
    }

    @Override
    public String apresentacao() {
        return tipo + ", " + (patio ? "com pátio":"sem pátio") + ", " + super.apresentacao();
    }
}
