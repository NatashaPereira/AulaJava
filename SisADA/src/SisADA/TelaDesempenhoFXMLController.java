package SisADA;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
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
      
       
    @FXML
    private BarChart grafico;
    
    @FXML
    private Button ConfirmaSelecao;
    
    @FXML
    private Button Voltar;
    

    public TelaDesempenhoFXMLController(){
        super("TelaDesempenhoFXML.fxml", "Desempenho");
       
        CategoryAxis xAxis = new CategoryAxis();
        
        NumberAxis yAxis = new NumberAxis();
                         
    }   
 
    private
    ObservableList<String> listDisciplina = FXCollections.observableArrayList("ADMINISTRAÇÃO DE NEGÓCIOS DE BASE TECNOLÓGICA",
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
        
        /** 
     * Initializes the controller class.
     */
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        SelecionarDisciplina.setItems(listDisciplina);
       
    }
    @FXML
    public void atualizarGrafico(ActionEvent evento) {
        grafico.getData().clear();
        String disciplina = SelecionarDisciplina.getValue();
        if(disciplina == null || disciplina.isEmpty()){
            
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION.ERROR);
            alert.setTitle("Selecione uma disciplina");
            alert.setHeaderText("Você não selecionou nenhuma disciplina.");

            alert.showAndWait();
            return;
        }
        
        
        double m1 = Avaliacao.CalculaMediaDaDisciplina(disciplina, "M1");        
        XYChart.Series m1Series = new XYChart.Series();
        m1Series.setName("M1");
        m1Series.getData().add(new XYChart.Data("", m1));
      
        double m2 = Avaliacao.CalculaMediaDaDisciplina(disciplina, "M2");
        XYChart.Series m2Series = new XYChart.Series();
        m2Series.setName("M2");
        m2Series.getData().add(new XYChart.Data("", m2));
        
        double m3 = Avaliacao.CalculaMediaDaDisciplina(disciplina, "M3");
        System.out.println(m3);
        XYChart.Series m3Series = new XYChart.Series();
        m3Series.setName("M3");
        m3Series.getData().add(new XYChart.Data("", m3));
        
        double mf = (m1+m2+m3)/3;
        XYChart.Series mfSeries = new XYChart.Series();
        mfSeries.setName("Média Final");
        mfSeries.getData().add(new XYChart.Data("", mf));
        
        grafico.getData().addAll(m1Series, m2Series, m3Series, mfSeries);
    }
    
    @FXML
    public void VoltaTelaAnterior(ActionEvent evento){
        GerenciadorJanela.obterInstancia().voltar();
    }
    
}
