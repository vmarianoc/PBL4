/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Classe responsavel por Calcular o menor caminho.
 *
 * @author gusta
 */
public class Dijkstra {

    private ArrayList<Cidade> menor_caminho;
    private LinkedList nao_visitados;
    private LinkedList<Cidade> visitados;
    private Cidade atual;

    public Dijkstra(LinkedList<Cidade> aux) {
        nao_visitados = aux;
        menor_caminho = new ArrayList<>();
        visitados = new LinkedList<>();
    }

    public ArrayList caminho(Cidade origem, Cidade destino) {
        menor_caminho.add(origem);
        while(!nao_visitados.isEmpty()){
            nao_visitados = infinito(nao_visitados, origem);
            atual = (Cidade) nao_visitados.get(0);
            nao_visitados.remove(0);
        }
        return menor_caminho;
    }

    private LinkedList infinito(LinkedList<Cidade> cidades, Cidade origem) {
        ComparaCidade c = new ComparaCidade();
        for (Cidade cidade : cidades) {
            if (cidade.equals(origem)) {
                cidade.setPeso(0);
            } else {
                cidade.setPeso(9999);
            }
        }
        Collections.sort(cidades, c);
        return cidades;
    }

    private class ComparaCidade implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            Cidade a1 = (Cidade) o1;
            Cidade a2 = (Cidade) o2;
            if (a1.getPeso() > a2.getPeso()) {
                return 1;
            } else if (a1.getPeso()< a2.getPeso()) {
                return -1;
            }else{
                return 0;
            }
        }

    }
}
