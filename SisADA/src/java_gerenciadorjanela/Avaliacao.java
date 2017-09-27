/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_gerenciadorjanela;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Natasha Pereira
 */
public class Avaliacao {
    private String nome;
    private String disciplina;
    private Double peso;
    private String media;
    private Double nota;
    private int identificaNoArquivo;
    public static String caminho = System.getProperty("user.dir").toString() + "\\avaliacoes.csv";


public static ArrayList<Avaliacao> obterListaAvaliacoes() {
    BufferedReader breader = null;
    FileReader freader = null;
    ArrayList<Avaliacao> avaliacoes = new ArrayList();
    try {
        freader = new FileReader(caminho);
        breader = new BufferedReader(freader);

        String linha;

        while ((linha = breader.readLine()) != null) {
            Avaliacao arqAvaliacao = new Avaliacao();
            String[] separados = linha.split(",");
            String nome = separados[0];
            String disciplina = separados[1];
            String media = separados[2];
            String peso = separados[3];
            if (separados.length > 4){     
                String nota = separados[4];
                arqAvaliacao.setNota(Double.parseDouble(nota));
            }
            arqAvaliacao.setNome(nome);
            arqAvaliacao.setDisciplina(disciplina);
            arqAvaliacao.setMedia(media);
            arqAvaliacao.setPeso(Double.parseDouble(peso));
            
            avaliacoes.add(arqAvaliacao);
        }
    } catch(Exception e) {
        System.out.println(e.getMessage());
    }
    return avaliacoes;
}

public double CalculaMediaDaDisciplina(String a, String b){
 
    return 1.3;

}


public void salvarCsv(){    
    StringBuilder bufSaida = new StringBuilder();

    try {
        FileWriter writer = new FileWriter(caminho, true);
        BufferedWriter bwriter = new BufferedWriter(writer);
        PrintWriter out = new PrintWriter(bwriter);
        
        String linha = nome + "," + disciplina + ","+ getMedia() + "," + peso;

        out.println(linha);
        out.close();
    } catch(Exception e) {}
}

void atualizar(){
    try {
        Path path = Paths.get(Avaliacao.caminho);
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        String linha = nome + "," + disciplina + ","+ getMedia() + "," + peso + "," +nota;
        lines.remove(TercearioFXMLController.indice);
        lines.add(TercearioFXMLController.indice, linha);
        Files.write(path, lines, StandardCharsets.UTF_8);
    } catch(Exception e) {}
}

void Excluir(){
    try {
        Path path = Paths.get(Avaliacao.caminho);
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        String linha = nome + "," + disciplina + ","+ getMedia() + "," + peso + "," +nota;
        lines.remove(TercearioFXMLController.indice);
    } catch(Exception e) {}
}

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the disciplina
     */
    public String getDisciplina() {
        return disciplina;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    /**
     * @return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    /**
     * @return the nota
     */
    public Double getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(Double nota) {
        this.nota = nota;
    }

    /**
     * @return the media
     */
    public String getMedia() {
        return media;
    }

    /**
     * @param media the media to set
     */
    public void setMedia(String media) {
        this.media = media;
    }

    /**
     * @return the media
     */
  
}