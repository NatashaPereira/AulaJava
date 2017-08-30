/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradordeprova;

/**
 *
 * @author 6207375
 */
public class Objetiva extends Questao {
    
    private String opcoes[] = new String[5];
    private int respostaCorreta;

    /**
     * @return the respostaCorreta
     */
    public int getRespostaCorreta() {
        return respostaCorreta;
    }

    /**
     * @param respostaCorreta the respostaCorreta to set
     */
    public void setRespostaCorreta(int respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    /**
     * @return the opcoes
     */
    public String[] getOpcoes() {
        return opcoes;
    }

    /**
     * @param opcoes the opcoes to set
     */
    public void setOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }


    public String retornaQuestao() {
        String parteProva= "";
         parteProva += "\n\nQuestão Objetiva " +this.getPergunta();
            
            String opcoes[] = this.getOpcoes();
            
            for (int j = 0; j < 5; j++) {
               parteProva += "\nAlternativa " + (j+1) + ": " + opcoes[j];
            }
            
            parteProva += "\nPeso da pergunta: " + this.getPeso();
            parteProva += "\nAlternativa correta: " + this.getRespostaCorreta();
           return parteProva;
            
}
    
}
