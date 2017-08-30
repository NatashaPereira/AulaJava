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
public class Discursiva extends Questao {
    
    private String criteriosCorrecao;

    /**
     * @return the criteriosCorrecao
     */
    public String getCriteriosCorrecao() {
        return criteriosCorrecao;
    }

    /**
     * @param criteriosCorrecao the criteriosCorrecao to set
     */
    public void setCriteriosCorrecao(String criteriosCorrecao) {
        this.criteriosCorrecao = criteriosCorrecao;
    }
    
    public String retornaQuestao() {
        String parteProva = "";
            parteProva += "\n\nQuestão Discursiva " + this.getPergunta();
            parteProva += "\nPeso da pergunta: " + this.getPeso();
            parteProva += "\nCritério de Correção: " + this.getCriteriosCorrecao();
            return parteProva;
        
    }
    
}
