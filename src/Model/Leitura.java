/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class Leitura {
    Mapa mapa;
    
    
    public Mapa readFile() throws FileNotFoundException, IOException{
        /*
        Faz a leitura do arquivo linha a linha, 
        Divide o que foi lido em strings menores que vai integrar os dados necessários para criar duas novas cidades e uma rota
        Coloca essa cidade numa estrutura de dados de uma cidade que armazena varias cidades e em outra que armazenam as rotas
        Fecha arquivo
        Retorna o mapa
        */
        
        Scanner ler = new Scanner(System.in);
        mapa = new Mapa();
        
        try{
            FileReader arq = new FileReader("Arquivos\\arquivodeentrada.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            
            String linha = lerArq.readLine();
            
            while(linha != null){
                
          //      Cidade cidade1;
                
            }
        }
        return mapa;
    }
    
    public Cidade dadosCidade(String linha){
        /*
        Método recebe uma linha inteira, divide os dados e coloca em uma cidade
        */
        Cidade cidade;
        
        
        
    }
}
