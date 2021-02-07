public class Aplicacao {

    public static void main (String[] args){

        Calculadora calculadora = new Calculadora ();

        double resultadoSoma1 = calculadora.soma(8.0,6.0);
        double resultadoSoma2 = calculadora.soma(1.0,9.0);
        double resultadoSoma3 = calculadora.soma(2.5,3.4);

        System.out.println ("Resultado da soma 8 + 6: " + resultadoSoma1);
        System.out.println ("Resultado da soma 1 + 9: " + resultadoSoma2);
        System.out.println ("Resultado da soma 2.5 + 3.4: " + resultadoSoma3);

    }

}
