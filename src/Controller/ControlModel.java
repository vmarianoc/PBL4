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
import javax.swing.DefaultListModel;

/**
 *
 * @author gusta
 */
public class ControlModel {
    private Dijkstra dijkstra;
    private Leitura leitura;
    private Mapa mapa;
    DefaultListModel modelo;
 //   private LinkedList<Veiculos> veiculos;
    
    
    public ControlModel() throws IOException{
       leitura = new Leitura();
//       veiculos = new LinkedList<>();
       mapa = leitura.readFile();
    }
    
//    public void addVeiculo(Veiculos a){
//        veiculos.add(a);
//    }
    
    public void listaAux(){
        LinkedList aux;
        aux = this.getMapa().getLista();
        for (int i = 0; i < aux.size(); i++ ){
            this.modelo.addElement(((Cidade) aux.get(i)).getNome());
        }
    }

    public DefaultListModel getModelo() {
        return modelo;
    }
    
    public ArrayList<Cidade> menorCaminho(Cidade origem, Cidade destino){
        ArrayList<Cidade> aux;
        dijkstra = new Dijkstra(mapa.getLista());
        aux = dijkstra.caminho(origem, destino);
        return aux;
    }
    
    public int distanciaMenorCaminho(ArrayList<Cidade> cidades){
        int distanciaTotal = 0;
        for(int i=0; i < cidades.size()-1; i++){
            distanciaTotal = distanciaTotal + cidades.get(i).getRotaAdjacentes(cidades.get(i+1)).getDistancia();
        }
        return distanciaTotal;
    }
    
    public Mapa getMapa(){
        return mapa;
    }
}
