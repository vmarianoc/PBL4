/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author vitor
 */
public class Rotas {

    private Cidade origem;
    private Cidade destino;
    private int distancia;

    public Rotas(Cidade origem, Cidade destino, int distancia) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public Cidade getOrigem() {
        return origem;
    }

    public void setOrigem(Cidade origem) {
        this.origem = origem;
    }

    public Cidade getDestino() {
        return destino;
    }

    public void setDestino(Cidade destino) {
        this.destino = destino;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rotas) {
           Rotas aux = (Rotas) obj;
           return aux.getDestino().equals(this.destino) && aux.getOrigem().equals(this.origem) && aux.getDistancia() == this.distancia;
        }
        return false;
    }
}

