public class PropostaFinanciamento {

    private Beneficiario beneficiario;
    private Imovel imovelEscolhido;
    private int mesesParaPagamento;

    public PropostaFinanciamento(Beneficiario beneficiario, Imovel imovelEscolhido, int mesesParaPagamento) {
        this.beneficiario = beneficiario;
        this.imovelEscolhido = imovelEscolhido;
        this.mesesParaPagamento = mesesParaPagamento;
    }

    /**
     * Valida a proposta de financiamento e apresenta o resultado para o cliente.
     *
     * A proposta de financiamento é aceita somente se o salário do beneficiário multiplicado pelo prazo de pagamento
     *   for equivalente a pelo menos 50% do valor do imóvel.
     *
     *   Esta regra possui duas exceções: se o imóvel se localiza no estado SP ou RJ,
     *      o salário multiplicado pelo prazo deve ser equivalente a 65% e 60% do valor imóvel (respectivamente).
     */
    public void validarProposta() {

        if (imovelEscolhido.getEndereco().getEstado() == UnidadeFederativa.RJ && beneficiario.getSalario() *
                mesesParaPagamento <= imovelEscolhido.getValor() * 0.6) {
            imprimirPropostaRecusada();
        }else if (imovelEscolhido.getEndereco().getEstado() == UnidadeFederativa.SP && beneficiario.getSalario() *
                mesesParaPagamento <= imovelEscolhido.getValor() * 0.65){
            imprimirPropostaRecusada();
        }else if(beneficiario.getSalario() * mesesParaPagamento <= imovelEscolhido.getValor() * 0.5){
            imprimirPropostaRecusada();
        }else{
            imprimirPropostaAprovada();
        }
    }

    public void imprimirPropostaAprovada() {
    /*    deve exibir todas as informações da proposta (beneficiário, imóvel, prazo) e parabenizar o beneficiário pois
        a proposta dele foi aceita;
     */
        System.out.println(toString());
        System.out.println("Parabéns!!! Sua vida pertence ao banco agora... Quer dizer, sua proposta foi aprovada!!!");

    }

    public void imprimirPropostaRecusada(){
     /*   deve exibir todas as informações da proposta (beneficiário, imóvel, prazo) e xingar o beneficiário pois a
        proposta não foi aceita.
      */

        System.out.println(toString());
        System.out.println("Sem chance... Alto risco de calote... Dá o fora!");
    }

    @Override
    public String toString() {
        return "Proposta de financiamento: " +
                "beneficiário: " + beneficiario.getNome() +
                ", imovel escolhido: " + imovelEscolhido.apresentacao() +
                ", prazo de quitação: " + mesesParaPagamento + " meses";
    }
}
