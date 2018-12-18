/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class Leitura {
    File f1;
    Mapa mapa;
    
    public Leitura() {
        f1 = new File(".\\Arquivos\\arquivodeentrada.txt");
    }
    
    public Mapa readFile() throws FileNotFoundException, IOException{
        /*
        Faz a leitura do arquivo linha a linha, 
        Divide o que foi lido em strings menores que vai integrar os dados necessários para criar duas novas cidades e uma rota
        Coloca essa cidade numa estrutura de dados de uma cidade que armazena varias cidades e em outra que armazenam as rotas
        Fecha arquivo
        Retorna o mapa
        */
        Cidade nova;
        String cidade;
        mapa = new Mapa();
        try{
            FileReader arq = new FileReader(f1);
            BufferedReader lerArq = new BufferedReader(arq);
            
            while((cidade = lerArq.readLine()) != null){
                nova = dadosCidade(cidade);
                mapa.add(nova);
            }
        }catch(FileNotFoundException e){
            throw e;
        }
        return mapa;
    }
    
    public Cidade dadosCidade(String linha){
        /*
        Método recebe uma linha inteira, divide os dados e coloca em uma cidade
        */
        Cidade cidade;
        String[] array;
        int x;
        int y;
        array = linha.split(";");
        x = Integer.parseInt(array[3]);
        y = Integer.parseInt(array[4]);
        cidade = new Cidade(x, y, array[0]);
       
        return cidade;
    }
}
