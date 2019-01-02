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
        String array[];
        Cidade nova;
        Cidade nova2;
        String cidade;
        mapa = new Mapa();
        try{
            FileReader arq = new FileReader(f1);
            BufferedReader lerArq = new BufferedReader(arq);
            while((cidade = lerArq.readLine()) != null){
                array = cidade.split(";");
                nova = dadosCidade(array[3], array[4], array[0]);
                nova2 = dadosCidade(array[5], array[6], array[1]);
                if(mapa.contains(nova) && mapa.contains(nova2)){
                    mapa.add_rota(nova, nova2, array[2]);
                }else if (mapa.contains(nova) && !mapa.contains(nova2)){
                    mapa.add(nova2);
                    mapa.add_rota(nova, nova2, array[2]);
                }else if(!mapa.contains(nova)&& mapa.contains(nova2)){
                    mapa.add(nova);
                    mapa.add_rota(nova, nova2, array[2]);
                }else{
                    mapa.add(nova);
                    mapa.add(nova2);
                    mapa.add_rota(nova, nova2, array[2]);
                }
            }
        }catch(FileNotFoundException e){
            throw e;
        }
        return mapa;
    }
    

    private Cidade dadosCidade(String x, String y, String nome){
        /*
        Método recebe uma linha inteira, divide os dados e coloca em uma cidade
        */
        Cidade cidade;
        int a;
        int b;  
        a = Integer.parseInt(x);
        b = Integer.parseInt(y);
        cidade = new Cidade(a, b, nome);
        return cidade;
    }
}
