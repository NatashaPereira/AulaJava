/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SisADA;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Natasha Pereira
 */
public class AdicionarNovaAvaliacaoFXMLController extends InterfaceUsuario{
    
    public AdicionarNovaAvaliacaoFXMLController(){
        super("AdicionarNovaAvaliacaoFXML.fxml", "Adicionar nova avaliação");
    }
    @FXML
    private TextField nomeUsuario;
    
    @FXML
    private TextField pesoUsuario;
    
    
    @FXML
    private ComboBox<String>  SelecionaDisciplina;
    
    @FXML
    private ComboBox<String> SelecionaMedia;
    
  
    
     @FXML
    private Button voltar;
    
    @FXML
    private Button salvar;
    
    private
    ObservableList<String> listMs = FXCollections.observableArrayList(
    "M1","M2","M3");
    
    private
    ObservableList<String> listDisci = FXCollections.observableArrayList("ADMINISTRAÇÃO DE NEGÓCIOS DE BASE TECNOLÓGICA",
"ÁLGEBRA I","ÁLGEBRA II","ALGORITMOS E PROGRAMAÇÃO I","ALGORITMOS E PROGRAMAÇÃO II","ANÁLISE E CONTROLE DE PROCESSOS",
"ARQUITETURA DE COMPUTADORES I","ARQUITETURA DE COMPUTADORES II",
"BANCO DE DADOS","CÁLCULO I","CÁLCULO II","CÁLCULO III","CALCULO NUMERICO",
"CIRCUITOS DIGITAIS","CIRCUITOS ELÉTRICOS","COMUNICAÇÃO DIGITAL","CONTROLE LÓGICO DE SISTEMAS","DESENHO TÉCNICO",
"ELETRÔNICA APLICADA","ELETRÔNICA BÁSICA","ENGENHARIA DE SOFTWARE I","ENGENHARIA DE SOFTWARE II",
"ENGENHARIA ECONÔMICA","ESTRUTURAS DE DADOS","ÉTICA EM INFORMÁTICA","FÍSICA I","FÍSICA GERAL",
"GERÊNCIA DE PROJETOS","GRAFOS","INTELIGÊNCIA ARTIFICIAL","INTERFACE HUMANO - COMPUTADOR",
"INTRODUÇÃO A ENGENHARIA DE COMPUTAÇÃO","INTRODUÇÃO À FÍSICA","INTRODUÇÃO AO CÁLCULO",
"INICIAÇÃO TÉCNICO-CIENTÍFICA","LINGUAGENS FORMAIS","MATEMÁTICA APLICADA À ENGENHARIA","MATEMATICA COMPUTACIONAL",
"MICROCONTROLADORES","ÓTICA E FÍSICA PARA SEMICONDUTORES","PROBABILIDADE E ESTATÍSTICA","PROCESSADOR DIGITAL DE SINAIS",
"PROJETO DE SISTEMAS EMBARCADOS","PROJETO DE SISTEMAS DIGITAIS I","PROJETO DE SISTEMAS DIGITAIS II",
"PROGRAMAÇÃO ORIENTADA A OBJETOS I","PROGRAMAÇÃO ORIENTADA A OBJETOS II","QUÍMICA I","QUÍMICA II",
"REDES DE COMPUTADORES I","REDES DE COMPUTADORES II","RESISTÊNCIA DOS MATERIAIS","SIMULAÇÃO DISCRETA",
"SISTEMAS DISTRIBUÍDOS","SISTEMAS EM TEMPO REAL","SISTEMAS OPERACIONAIS","SISTEMAS ROBÓTICOS",
"TRABALHO TÉCNICO-CIENTÍFICO DE CONCLUSÃO DE CURSO I","TRABALHO TÉCNICO-CIENTÍFICO DE CONCLUSÃO DE CURSO II",
"TRABALHO TÉCNICO-CIENTÍFICO DE CONCLUSÃO DE CURSO III","TÓPICOS ESPECIAIS EM ENGENHARIA DE COMPUTAÇÃO",
"TÓPICOS ESPECIAIS EM HARDWARE","TÓPICOS ESPECIAIS EM INTEGRAÇÃO SOFTWARE HARDWARE"
);
        
    public void initialize(URL url, ResourceBundle rb) {
    SelecionaMedia.setItems(listMs);
    SelecionaDisciplina.setItems(listDisci);
    }  
    
    @FXML
    public void voltarTelaAnterior(ActionEvent evento ){
        GerenciadorJanela.obterInstancia().voltar();
    }
    
     
        
    
    
    
    @FXML
    public void SalvarEVoltarTela(ActionEvent evento ){
        Avaliacao avaliacao = new Avaliacao();
        String peso = pesoUsuario.getText();
        String d = SelecionaDisciplina.getValue();
        String m = SelecionaMedia.getValue();
        if (peso.isEmpty()||nomeUsuario.getText().isEmpty()||d.isEmpty()||m.isEmpty()){
             Alert alert = new Alert(Alert.AlertType.CONFIRMATION.ERROR);
            alert.setTitle("Todos os campos devem ser preenchidos");
            alert.setHeaderText("Você não preencheu um campo obrigatótio.");

            alert.showAndWait();
            return;
        }
        avaliacao.setNome(nomeUsuario.getText());        
        double pesoEmDouble = Double.parseDouble(peso);
        avaliacao.setPeso(pesoEmDouble);        
        avaliacao.setDisciplina(d);        
        avaliacao.setMedia(SelecionaMedia.getValue());        
        avaliacao.salvarCsv();
        GerenciadorJanela.obterInstancia().voltar();
    }
  
    
    
    
}