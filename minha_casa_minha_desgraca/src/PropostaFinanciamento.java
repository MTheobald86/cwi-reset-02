
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
