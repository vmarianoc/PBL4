/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Model.Cidade;
import Model.Rotas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vitor
 */
public class Grafo {

    private List<Cidade> _cidades;
    private List<Rotas> _rotas;

    public Grafo() {
        _cidades = new ArrayList<>();
        this._rotas = new ArrayList<>();
    }

    public void adicionaVertice(int x, int y, String nome) {
        Cidade cidade = new Cidade(x, y, nome);
        _cidades.add(cidade);
    }

    public void adicionaAresta(Cidade inicio, Cidade fim, int distancia) {
        /*
        Cria e adiciona uma rota(Aresta) no grafo
         */
        Rotas rota = new Rotas(inicio, fim, distancia);
        inicio.adicionaAdj(rota);
        _rotas.add(rota);

        //Coloca do fim para o inico
        Rotas rotasAdj = new Rotas(inicio, fim, distancia);
        fim.adicionaAdj(rotasAdj);
        _rotas.add(rotasAdj);
    }
    
    /*
    Verifica se existe alguma cidade com aquelas cidades
    */
    private Rotas existeRotasComAsCidades(Cidade fim, Cidade inicio){
        for (Rotas rotas : _rotas){
            if(rotas.getOrigem().equals(fim) && rotas.getDestino().equals(inicio)){
                return rotas;
            }
        }
        return null;
    }
    
}
