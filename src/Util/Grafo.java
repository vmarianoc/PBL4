/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.util.LinkedList;

/**
 *
 * @author vitor
 */
public class Grafo {
    private LinkedList listaVertice;
    private LinkedList listaAresta;

    public LinkedList getListaVertice() {
        return listaVertice;
    }

    public void setListaVertice(LinkedList listaVertice) {
        this.listaVertice = listaVertice;
    }

    public LinkedList getListaAresta() {
        return listaAresta;
    }

    public void setListaAresta(LinkedList listaAresta) {
        this.listaAresta = listaAresta;
    }

    public Grafo(LinkedList listaVertice, LinkedList listaAresta) {
        this.listaVertice = listaVertice;
        this.listaAresta = listaAresta;
    }
    
    
}
