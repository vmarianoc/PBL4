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
}
