/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SisADA;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Natasha Pereira
 */
public class MinhasAvaliacoesFXMLController extends InterfaceUsuario{
    
    public MinhasAvaliacoesFXMLController(){
        super("MinhasAvaliacoesFXML.fxml", "Minhas Avaliações");
    }
    
    @FXML
    private Button InformaNota;
    
    @FXML
    private Button AdicionaAvaliacao;
    
    @FXML
    private Button voltar;

    @FXML
    private Button excluir;
    
    @FXML
    private TableView listaAvaliacoes;
    
    @FXML
    private TableColumn coluna1;
    
    @FXML
    private TableColumn coluna2;
    
    @FXML
    private TableColumn coluna3;
    
    @FXML
    private TableColumn coluna4;
    
    @FXML
    private TableColumn coluna5;
    
    private ArrayList<Avaliacao> avaliacoes;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        avaliacoes = Avaliacao.obterListaAvaliacoes();
        popularLista(avaliacoes, listaAvaliacoes);
        coluna1.setCellValueFactory(new PropertyValueFactory<Avaliacao, String>("nome"));
        coluna2.setCellValueFactory(new PropertyValueFactory<Avaliacao, String>("disciplina"));
        coluna3.setCellValueFactory(new PropertyValueFactory<Avaliacao, String>("media"));
        coluna4.setCellValueFactory(new PropertyValueFactory<Avaliacao, String>("peso"));
        coluna5.setCellValueFactory(new PropertyValueFactory<Avaliacao, String>("nota"));
    }

    @Override
    public void retornar() {
        avaliacoes = Avaliacao.obterListaAvaliacoes();
        popularLista(avaliacoes, listaAvaliacoes);
    }
    
    @FXML
    public void InformaNota(ActionEvent evento ){
        Avaliacao avaliacaoSelecionada = (Avaliacao) listaAvaliacoes.getSelectionModel().getSelectedItem();
        if(avaliacaoSelecionada == null){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION.ERROR);
            alert.setTitle("Selecione uma avaliação");
            alert.setHeaderText("Você não selecionou nenhuma avaliação.");

            alert.showAndWait();
            return;
        }
        InformarNotaFXMLController proximaTela = new InformarNotaFXMLController(avaliacaoSelecionada, avaliacoes.indexOf(avaliacaoSelecionada));
        GerenciadorJanela.obterInstancia().abreJanela(proximaTela);
    }
  
    
    
    @FXML
    public void CadastraAvaliacao(ActionEvent evento){
        AdicionarNovaAvaliacaoFXMLController proximaTela = new AdicionarNovaAvaliacaoFXMLController();
        GerenciadorJanela.obterInstancia().abreJanela(proximaTela);
    }
    
    @FXML
    public void voltarParaPrimeiraTela(ActionEvent evento ){
        GerenciadorJanela.obterInstancia().voltar();
    }
    
    public void popularLista(ArrayList<Avaliacao> avaliacoes, TableView tabela) {        
        tabela.getItems().clear();
        for (Avaliacao avaliacao : avaliacoes) {
            tabela.getItems().add(avaliacao);
        }

    }
  @FXML
    public void ExcluirAvaliacao(ActionEvent evento){
        Avaliacao avaliacaoSelecionada = (Avaliacao) listaAvaliacoes.getSelectionModel().getSelectedItem();
        if(avaliacaoSelecionada == null){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION.ERROR);
            alert.setTitle("Selecione uma avaliação");
            alert.setHeaderText("Você não selecionou nenhuma avaliação.");

            alert.showAndWait();
            return;
        }
        int indicie = listaAvaliacoes.getSelectionModel().getSelectedIndex();
        avaliacaoSelecionada.setIdentificaNoArquivo(indicie);
        avaliacaoSelecionada.Excluir();
        avaliacoes = Avaliacao.obterListaAvaliacoes();
        popularLista(avaliacoes, listaAvaliacoes);
    }       
        
    }
    
   
