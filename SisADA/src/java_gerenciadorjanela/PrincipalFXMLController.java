/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_gerenciadorjanela;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Natasha Pereira
 */
public class PrincipalFXMLController extends InterfaceUsuario {
    
    @FXML
    private Button minhasAvaliacoes;
    
    @FXML
    private Button meuDesempenho;

    public PrincipalFXMLController(){
        super("PrincipalFXML.fxml", "Acompanhamento de Desenvolvimento Acadêmico - SisADA");
    }

    /** 
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void irParaSegundaTela(ActionEvent evento){
        SecundarioFXMLController proximaTela = new SecundarioFXMLController();
        GerenciadorJanela.obterInstancia().abreJanela(proximaTela);
    }
    
    @FXML
    public void irParaTelaDesempenho (ActionEvent evento){
        TelaDesempenhoFXMLController proximaTela = new TelaDesempenhoFXMLController();
        GerenciadorJanela.obterInstancia().abreJanela(proximaTela);
    }
    
}
