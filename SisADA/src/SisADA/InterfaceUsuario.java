/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SisADA;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

/**
 *
 * @author Natasha Pereira
 */
public abstract class InterfaceUsuario implements Initializable{
    
    private Scene minhaCena;
    private String caminhoFxml;
    private String titulo;
    
    protected InterfaceUsuario(String caminhoFxml) {
        this.caminhoFxml = caminhoFxml;
    }
    
    protected InterfaceUsuario(String caminhoFxml, String titulo) {
        this.caminhoFxml = caminhoFxml;
        this.titulo = titulo;
    }
    
    public void retornar(){
        
    }
    
    public final Scene obterCena()  {
        if(this.minhaCena != null){
            return this.minhaCena;
        }
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(caminhoFxml));
            loader.setController(this);            
            Pane elementoPrincipal = loader.load();            
            this.minhaCena = new Scene( elementoPrincipal, 1024, 768
          );
        } catch (IOException ex) {
            Logger.getLogger(InterfaceUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.minhaCena;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
}
