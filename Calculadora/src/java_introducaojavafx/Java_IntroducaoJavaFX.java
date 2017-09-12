/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_introducaojavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 6207375
 */
public class Java_IntroducaoJavaFX extends Application{


    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        VBox orquestrador = new VBox();
        orquestrador.setSpacing(10);
        orquestrador.setStyle("-fx-background-color: #40E0D0;");
        
        TextField num1 = new TextField();
        TextField num2 = new TextField();
        Label resultado = new Label("Resultado");
      
                
        Button botao = new Button("Somar");
        botao.setStyle("-fx-background-color: #7FFFD4;");
        botao.setOnAction( new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                String valorNum1 = num1.getText();
                String valorNum2 = num2.getText();
                double num1EmDouble = Double.parseDouble(valorNum1);
                double num2EmDouble = Double.parseDouble(valorNum2);
                double numResultado = num1EmDouble + num2EmDouble;
                resultado.setText( "O resultado da operação é: "+numResultado);
            }
        } );
        
         Button botao1 = new Button("Subtrair");
         botao1.setStyle("-fx-background-color: #7FFFD4;");
        botao1.setOnAction( new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                String valorNum1 = num1.getText();
                String valorNum2 = num2.getText();
                double num1EmDouble = Double.parseDouble(valorNum1);
                double num2EmDouble = Double.parseDouble(valorNum2);
                double numResultado = num1EmDouble - num2EmDouble;
                resultado.setText( "O resultado da operaçao é: "+numResultado);
            }
        } );
        
        Button botao2 = new Button("Dividir");
        botao2.setStyle("-fx-background-color: #7FFFD4;");
        botao2.setOnAction( new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                String valorNum1 = num1.getText();
                String valorNum2 = num2.getText();
                double num1EmDouble = Double.parseDouble(valorNum1);
                double num2EmDouble = Double.parseDouble(valorNum2);
                double numResultado = num1EmDouble / num2EmDouble;
                resultado.setText( "O resultado da operaçao é: "+numResultado);
            }
        } );
        
        Button botao3 = new Button("Multiplicar");
        botao3.setStyle("-fx-background-color: #7FFFD4;");
        botao3.setOnAction( new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                String valorNum1 = num1.getText();
                String valorNum2 = num2.getText();
                double num1EmDouble = Double.parseDouble(valorNum1);
                double num2EmDouble = Double.parseDouble(valorNum2);
                double numResultado = num1EmDouble * num2EmDouble;
                resultado.setText( "O resultado da operaçao é: "+numResultado);
            }
        } );
        
        Button botao4 = new Button ("Potencia");
        botao4.setStyle("-fx-background-color: #7FFFD4;");
        botao4.setOnAction( new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                String valorNum1 = num1.getText();
                String valorNum2 = num2.getText();
               
                double num1EmDouble = Double.parseDouble(valorNum1);
                double num2EmDouble = Double.parseDouble(valorNum2);
                 double aux=num1EmDouble;
                 
              for (double i=1;i<num2EmDouble;i++){
             
                  num1EmDouble= num1EmDouble*aux;
                  
              }
                double numResultado = num1EmDouble;
                resultado.setText( "O resultado da operaçao é: "+numResultado);
            }
        } );
                
   
        //adicionando os views
        orquestrador.getChildren().add(num1);
        orquestrador.getChildren().add(num2);
        orquestrador.getChildren().add(botao);
        orquestrador.getChildren().add(botao1);
        orquestrador.getChildren().add(botao2);
        orquestrador.getChildren().add(botao3);
        orquestrador.getChildren().add(botao4);
        orquestrador.getChildren().add(resultado);
        
        Scene cena = new Scene(orquestrador, 500, 300);
        
        stage.setScene(cena);
        stage.setTitle("Calculadora");
        stage.show();
        
    }

    
}
