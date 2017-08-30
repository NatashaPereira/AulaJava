package geradordeprova;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class GeradorDeProva {
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Prova p1 = new Prova("POO");
        
        System.out.print("Disciplina: ");
        p1.setNomeDisciplina(s.nextLine());
        
        System.out.print("Local: ");
        p1.setLocal(s.nextLine());
        
        System.out.print("Data: ");
        p1.setData(s.nextLine());
        
        System.out.print("Peso: ");
        p1.setPeso(s.nextInt());
        
        System.out.print("Qtde de questões discursivas: ");
        int qtdDiscursivas = s.nextInt();        
        s.nextLine(); //Limpar o buffer
        Discursiva[] discursivas = new Discursiva[qtdDiscursivas];
        
        for (int i = 0; i < qtdDiscursivas; i++) {
            
            Discursiva d1 = new Discursiva();
            
            System.out.print("Insira a pergunta: ");
            d1.setPergunta(s.nextLine());
            System.out.print("Insira o peso: ");
            d1.setPeso(s.nextDouble());
            s.nextLine();
            System.out.print("Insira o criterio de correção da questão " + (i+1) + ": ");
            d1.setCriteriosCorrecao(s.nextLine());
            discursivas[i] = d1;
            
        }
        
        p1.setQuestoesDiscursivas(discursivas);
        
        System.out.print("Qtde de questões objetivas: ");
        int qtdObjetivas = s.nextInt();        
        s.nextLine(); //Limpar o buffer
        Objetiva[] objetivas = new Objetiva[qtdObjetivas];
        
        for (int i = 0; i < qtdObjetivas; i++) {
            
            Objetiva o1 = new Objetiva();
            String alternativas[] = new String[5];
            
            System.out.print("Insira a pergunta: ");
            o1.setPergunta(s.nextLine());
            System.out.print("Insira o peso: ");
            o1.setPeso(s.nextDouble());
            s.nextLine();
            
            for (int j = 0; j < 5; j++) {
                
                System.out.print("Insira a alternativa " + (j+1) + ": ");
                alternativas[j] = s.nextLine();
                
            }
            
            o1.setOpcoes(alternativas);
            
            System.out.print("Insira a alternativa correta: ");
            o1.setRespostaCorreta(s.nextInt());
            objetivas[i] = o1;
            s.nextLine();
            
        }
        
        p1.setQuestoesObjetivas(objetivas);
        
        //System.out.println(p1.obtemDetalhes());
        JOptionPane.showMessageDialog(null, p1.obtemDetalhes());
        
    }
    
}
