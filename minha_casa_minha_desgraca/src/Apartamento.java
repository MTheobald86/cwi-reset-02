public class Apartamento extends Imovel{
   private static String tipo = "apartamento";
   private int andar;

    public Apartamento(Endereco endereco, double valor, String tipo, int andar) {
        super(endereco, valor);
        this.tipo = tipo;
        this.andar = andar;
    }

    public static String getTipo() {
        return tipo;
    }

    public int getAndar() {
        return andar;
    }

    @Override
    public String apresentacao() {
        return tipo + ", " + andar + "º andar, " + super.apresentacao();

    }
}
