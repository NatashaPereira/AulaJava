package geradordeprova;

public class Prova {

    private String nomeDisciplina;
    private int peso;
    private String local;
    private String data;
    private Discursiva[] questoesDiscursivas;
    private Objetiva[] questoesObjetivas;
    
    /**
     * Construtor que já tem peso 10 como default
     * @param String que recebe a disciplina 
     */
    
    public Prova (String disciplina) {
        this.nomeDisciplina = disciplina;
        this.peso = 10;
    }
    
    /**
     * Método que retorna a descrição da prova
     * @return String já com os dados
    */
    
    public String obtemDetalhes(){
        
        String provaString = "\n\nRELATÓRIO DE PROVA\n\n";
        provaString += "Disciplina: " + this.getNomeDisciplina();
        provaString += " - Data: " + this.getData();
        provaString += "\nLocal: " + this.getLocal();
        provaString += " - Peso: " + this.getPeso();
        
        
         Discursiva[] d = this.getQuestoesDiscursivas();
       for (int i = 0; i < this.getQuestoesDiscursivas().length; i++) {
           provaString+= this.getQuestoesDiscursivas()[i].retornaQuestao();
         
           }
    
        provaString += "\n\n------------------------------------------";
        
         Objetiva[] o = this.getQuestoesObjetivas();
        for (int i = 0; i < this.getQuestoesObjetivas().length; i++) {
            provaString+= this.getQuestoesObjetivas()[i].retornaQuestao();
           
        }
        
        provaString += "\n\n-----------------FIM DO RELATÓRIO-------------------------\n";
        
        return provaString;
    }
    
    public String obtemProvaImpressao() {
        return null;
    }

    /**
     * @return the nomeDisciplina
     */
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    /**
     * @param nomeDisciplina the nomeDisciplina to set
     */
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the questoesDiscursivas
     */
    public Discursiva[] getQuestoesDiscursivas() {
        return questoesDiscursivas;
    }

    /**
     * @param questoesDiscursivas the questoesDiscursivas to set
     */
    public void setQuestoesDiscursivas(Discursiva[] questoesDiscursivas) {
        this.questoesDiscursivas = questoesDiscursivas;
    }

    /**
     * @return the questoesObjetivas
     */
    public Objetiva[] getQuestoesObjetivas() {
        return questoesObjetivas;
    }

    /**
     * @param questoesObjetivas the questoesObjetivas to set
     */
    public void setQuestoesObjetivas(Objetiva[] questoesObjetivas) {
        this.questoesObjetivas = questoesObjetivas;
    }
    
}