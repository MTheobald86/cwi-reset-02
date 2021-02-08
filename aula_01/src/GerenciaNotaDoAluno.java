public class GerenciaNotaDoAluno {

    public static void main (String [] args){

        Aluno aluno1 = new Aluno("José das Couves", 6.9);


        System.out.println ("O aluno " + aluno1.getNomeDoAluno() + " obteve nota final" + aluno1.getNotaFinalDoAluno() + ". Aprovado? " + aluno1.isAprovado());

    }
}
