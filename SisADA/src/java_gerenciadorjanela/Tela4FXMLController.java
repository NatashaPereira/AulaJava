/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_gerenciadorjanela;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Natasha Pereira
 */
public class Tela4FXMLController extends InterfaceUsuario{
    
    public Tela4FXMLController(){
        super("Tela4FXML.fxml", "Adicionar nova avaliação");
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
    ObservableList<String> listDisci = FXCollections.observableArrayList("ÉTICA EM INFORMÁTICA",
"MATEMATICA COMPUTACIONAL",
"ALGORITMOS E PROGRAMAÇÃO",
"ÁLGEBRA",
"INTRODUÇÃO AO CÁLCULO",
"INICIAÇÃO TÉCNICO-CIENTÍFICA",
"INTRODUÇÃO A ENGENHARIA DE COMPUTAÇÃO",
"INTRODUÇÃO À FÍSICA",
"CÁLCULO",
"ALGORITMOS E PROGRAMAÇÃO",
"CIRCUITOS DIGITAIS",
"DESENHO TÉCNICO",
"FÍSICA GERAL",
"ÁLGEBRA",
"CÁLCULO",
"ESTRUTURAS DE DADOS",
"PROGRAMAÇÃO ORIENTADA A OBJETOS",
"ARQUITETURA DE COMPUTADORES",
"FÍSICA",
"QUÍMICA",
"ARQUITETURA DE COMPUTADORES",
"PROGRAMAÇÃO ORIENTADA A OBJETOS",
"CÁLCULO",
"ANÁLISE DE CIRCUITOS ELÉTRICOS",
"QUÍMICA",
"ÓTICA E FÍSICA PARA SEMICONDUTORES",
"RESISTÊNCIA DOS MATERIAIS",
"BANCO DE DADOS",
"SISTEMAS OPERACIONAIS",
"MATEMÁTICA APLICADA À ENGENHARIA",
"ENGENHARIA DE SOFTWARE",
"PROBABILIDADE E ESTATÍSTICA",
"ELETRÔNICA BÁSICA",
"INTERFACE HUMANO - COMPUTADOR",
"ENGENHARIA DE SOFTWARE",
"REDES DE COMPUTADORES",
"CALCULO NUMERICO",
"LINGUAGENS FORMAIS",
"ELETRÔNICA APLICADA",
"ANÁLISE E CONTROLE DE PROCESSOS",
"ENGENHARIA ECONÔMICA",
"REDES DE COMPUTADORES",
"GRAFOS",
"CONTROLE LÓGICO DE SISTEMAS",
"MICROCONTROLADORES",
"PROJETO DE SISTEMAS DIGITAIS",
"INTELIGÊNCIA ARTIFICIAL",
"TRABALHO TÉCNICO-CIENTÍFICO DE CONCLUSÃO DE CURSO",
"PROJETO DE SISTEMAS EMBARCADOS",
"SISTEMAS EM TEMPO REAL",
"COMUNICAÇÃO DIGITAL",
"PROCESSADOR DIGITAL DE SINAIS",
"SISTEMAS ROBÓTICOS",
"SIMULAÇÃO DISCRETA",
"GERÊNCIA DE PROJETOS",
"TÓPICOS ESPECIAIS EM ENGENHARIA DE COMPUTAÇÃO",
"TÓPICOS ESPECIAIS EM HARDWARE",
"TRABALHO TÉCNICO-CIENTÍFICO DE CONCLUSÃO DE CURSO",
"ADMINISTRAÇÃO DE NEGÓCIOS DE BASE TECNOLÓGICA",
"TÓPICOS ESPECIAIS EM INTEGRAÇÃO SOFTWARE HARDWARE",
"TRABALHO TÉCNICO-CIENTÍFICO DE CONCLUSÃO DE CURSO",
"SISTEMAS DISTRIBUÍDOS"
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
        avaliacao.setNome(nomeUsuario.getText());
        String peso = pesoUsuario.getText();
        double pesoEmDouble = Double.parseDouble(peso);
        avaliacao.setPeso(pesoEmDouble);
        String d = SelecionaDisciplina.getValue();
        avaliacao.setDisciplina(d);
        String m = SelecionaMedia.getValue();
        avaliacao.setMedia(SelecionaMedia.getValue());
        avaliacao.salvarCsv();
        GerenciadorJanela.obterInstancia().voltar();
    }
  
    
    
    
}