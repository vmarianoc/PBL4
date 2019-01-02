/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.List;
import java.util.LinkedList;



/**
 *
 * @author vitor
 */
public class Mapa {
    private LinkedList<Cidade> mapa = new LinkedList<>();
    
    public void add(Cidade e){
        mapa.add(e);
    }
    
    public boolean contains(Cidade e){
        return mapa.contains(e);
    }
    
    public void add_rota(Cidade origem, Cidade destino, String distancia){
        int x;
        x = Integer.parseInt(distancia);
        Rotas aux = new Rotas(origem, destino, x);
        if()
            origem.adicionaAdj(aux);
            destino.adicionaAdj(aux);
    }
}
