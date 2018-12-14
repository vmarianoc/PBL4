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
public class Veiculos {
    
    private String nome;
    private double consumo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public Veiculos(String nome, double consumo) {
        this.nome = nome;
        this.consumo = consumo;
    }
    
    
    
    
}
