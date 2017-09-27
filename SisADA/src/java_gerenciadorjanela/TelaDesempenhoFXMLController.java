package java_gerenciadorjanela;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;


/**
 * FXML Controller class
 *
 * @author Natasha Pereira
 */
public class TelaDesempenhoFXMLController extends InterfaceUsuario {
    
    @FXML
    private ComboBox<String>  SelecionarDisciplina;
      
    
    

    public TelaDesempenhoFXMLController(){
        super("TelaDesempenhoFXML.fxml", "Desempenho");
    }
    

      //CategoryAxis lineXAxis = new CategoryAxis();
      //CategoryAxis lineYAxis = new CategoryAxis();

        //BarChart barChart =     new BarChart(lineXAxis,lineYAxis);
        
       // lineYAxis.setLabel("Sales");
       // lineXAxis.setLabel("Products");
        
       //  root.getChildren().addAll(barChart);
       //  scene.setRoot(root);
    
        
 
private    ObservableList<String> listDisciplina = FXCollections.observableArrayList("ÉTICA EM INFORMÁTICA",
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
        
        /** 
     * Initializes the controller class.
     */
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        SelecionarDisciplina.setItems(listDisciplina);
    }

    @FXML
    public void VoltaTelaAnterior(ActionEvent evento){
        GerenciadorJanela.obterInstancia().voltar();
    }
    
}
