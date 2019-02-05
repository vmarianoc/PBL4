/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cidade;
import Model.Dijkstra;
import Model.Leitura;
import Model.Mapa;
import Model.Veiculos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author gusta
 */
public class ControlModel {
    private Dijkstra dijkstra;
    private Leitura leitura;
    private Mapa mapa;
    private LinkedList<Veiculos> veiculos;
    
    
    public ControlModel(){
       leitura = new Leitura();
       veiculos = new LinkedList<>();
    }
    
    public void carregarArquivo() throws IOException{
        mapa = leitura.readFile();
    }
    
    public void addVeiculo(Veiculos a){
        veiculos.add(a);
    }
    
    public ArrayList<Cidade> menorCaminho(Cidade origem, Cidade destino){
        ArrayList<Cidade> aux;
        dijkstra = new Dijkstra(mapa.getLista());
        aux = dijkstra.caminho(origem, destino);
        return aux;
    }
}
