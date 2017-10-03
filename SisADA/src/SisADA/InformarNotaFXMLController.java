/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SisADA;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Natasha Pereira
 */
public class InformarNotaFXMLController extends InterfaceUsuario{

    private Avaliacao avaliacao;
    public static int indice;
    
    
    public InformarNotaFXMLController(Avaliacao a, int indice) {
        super("InformarNotaFXML.fxml","Informar nota");
        avaliacao = a; 
        this.indice = indice;
    }
   
    
    
 @FXML
 private Label nome;
 
 @FXML
 private Label disciplina;
 
 @FXML
 private Label media;
 
 @FXML
 private TextField notaUsuario;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println(avaliacao.getNome());
        nome.setText("Nome: "+avaliacao.getNome());
        disciplina.setText("Disciplina: " + avaliacao.getDisciplina());
        media.setText("Media: "+ (avaliacao.getMedia()));
    }
    
    @FXML
    public void voltarParaSeguntaTela(ActionEvent evento ){
        GerenciadorJanela.obterInstancia().voltar();
    }
    
    @FXML
    public void voltarParaPrimeiraTela(ActionEvent evento){        
        avaliacao.setNota(Double.parseDouble(notaUsuario.getText()));
        avaliacao.atualizar();
        GerenciadorJanela.obterInstancia().voltar();
    }
    

}
