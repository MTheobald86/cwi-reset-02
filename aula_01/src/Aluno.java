public class Aluno {
    private String nomeDoAluno;
    private double notaFinalDoAluno;
    private boolean aprovado;

    public Aluno(String nomeDoAluno, double notaFinalDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
        this.notaFinalDoAluno = notaFinalDoAluno;
    }

    public double getNotaFinalDoAluno() {
        return notaFinalDoAluno;
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public boolean isAprovado() {
        if (notaFinalDoAluno >= 7){
            aprovado = true;
        }
        return aprovado;
    }



}
