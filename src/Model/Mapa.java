/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author vitor
 */
public class Mapa {

    private LinkedList<Cidade> mapa;

    public Mapa() {
        mapa = new LinkedList<>();
    }
    
    //Adiciona uma cidade ao mapa caso ela ainda não exista.
    public void add(Cidade e) {
        if (!mapa.contains(e)) {
            mapa.add(e);
        }
    }
    
    /**
     * Metodo responsavel por adicionar as rotas as cidades. Busca em uma lista
     * a cidade origem ou destino e então adiciona a rota a esta cidade caso
     * encontre.
     **/
    public void add_rota(Cidade origem, Cidade destino, String distancia) {
        Iterator it = mapa.iterator();
        Cidade p;
        int x;
        x = Integer.parseInt(distancia);
        Rotas aux = new Rotas(origem, destino, x);
        while(it.hasNext()){
            p = (Cidade) it.next();
            if(p.equals(origem) || p.equals(destino)){
                p.adicionaAdj(aux);
            }
        }
    }
    
    public Iterator getCidades(){
        return mapa.iterator();
    }
}
