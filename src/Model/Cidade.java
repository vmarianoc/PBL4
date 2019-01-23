/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author vitor
 */
public class Cidade {
    
    private Cidade anterior;
    private int peso;
    private int x;
    private int y;
    private String nome;
    private boolean selecionado;
    private List<Rotas> adjacente;

    public Cidade(int x, int y, String nome){
        this.x = x;
        this.y = y;
        this.nome = nome;
        adjacente = new LinkedList<>();
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isSelecionado() {
        return selecionado;
    }

    public void setSelecionado(boolean selecionado) {
        this.selecionado = selecionado;
    }

    public void adicionaAdj(Rotas rota) {
        if(!adjacente.contains(rota)){
            adjacente.add(rota);
        }
    }
    
    public void setAnterior(Cidade a){
        anterior = a;
    }
    
    public Cidade getAnterior(){
        return anterior;
    }
    
    public void setPeso(int valor){
        peso = valor;
    }
    
    public int getPeso(){
        return peso;
    }

    public Iterator getAdjacente() {
        return adjacente.iterator();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cidade) {
            Cidade aux = (Cidade) obj;
            return x == aux.getX() && y == aux.getY() && this.nome.equals(aux.getNome());
        }
        return false;
    }
}
