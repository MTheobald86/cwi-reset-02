public class Aplicacao {

    public static void main (String[] args){

        Calculadora calculadora = new Calculadora ();

        double resultadoSoma1 = calculadora.soma(8.0,6.0);
        double resultadoSoma2 = calculadora.soma(1.0,-9.0);
        double resultadoSoma3 = calculadora.soma(2.5,3.4);

        double resultadoSubtracao1 = calculadora.subtrai(20.0,19.0);
        double resultadoSubtracao2 = calculadora.subtrai(-16.0,10.0);
        double resultadoSubtracao3 = calculadora.subtrai(34,1.3);

        double resultadoMultiplicacao1 = calculadora.multiplica (2.0,9.0);
        double resultadoMultiplicacao2 = calculadora.multiplica (-16.0,10.0);
        double resultadoMultiplicacao3 = calculadora.multiplica (4.0,1.3);

        double resultadoDivisao1 = calculadora.divide(8.0,6.0);
        double resultadoDivisao2 = calculadora.divide(1.0,-9.0);
        double resultadoDivisao3 = calculadora.divide(2.5,3.4);

        System.out.println ("Resultado da subtração 20 - 19: " + resultadoSubtracao1);
        System.out.println ("Resultado da subtração -16 - (10): " + resultadoSubtracao2);
        System.out.println ("Resultado da subtração 34 - 1.3: " + resultadoSubtracao3);

        System.out.println ("Resultado da soma 8 + 6: " + resultadoSoma1);
        System.out.println ("Resultado da soma 1 + (-9): " + resultadoSoma2);
        System.out.println ("Resultado da soma 2.5 + 3.4: " + resultadoSoma3);

        System.out.println ("Resultado da multiplicação 2 * 9: " + resultadoMultiplicacao1);
        System.out.println ("Resultado da multiplicação -16 * 10: " + resultadoMultiplicacao2);
        System.out.println ("Resultado da multiplicação 4 * 1.3: " + resultadoMultiplicacao3);

        System.out.println ("Resultado da divisão 8 / 6: " + resultadoDivisao1);
        System.out.println ("Resultado da divisão 1 / (-9): " + resultadoDivisao2);
        System.out.println ("Resultado da divisão 2.5 / 3.4: " + resultadoDivisao3);



    }

}
