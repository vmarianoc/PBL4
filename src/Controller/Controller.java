/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Canvas;
import View.TelaRotas;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class Controller {

    private ControlModel model;
    private Canvas view;
    private TelaRotas mainview;

    public Controller() throws IOException {
        model = new ControlModel();
        view = new Canvas();
        mainview = new TelaRotas();
    }

    public double calculaValor(ArrayList cidades) {
        double consumo = mainview.getConsumo();
        double valor = mainview.getValor();
        int distancia = model.distanciaMenorCaminho(cidades);
        return (distancia / consumo) * valor;
    }

    public int distanciaTotal(ArrayList cidades) {
        return model.distanciaMenorCaminho(cidades);
    }

    public double volumeTotal(ArrayList cidades) {
        double consumo = mainview.getConsumo();
        int distancia = model.distanciaMenorCaminho(cidades);
        return (distancia / consumo);
    }

    public static void main(String args[]) throws IOException {
        Controller controller = new Controller();
        controller.view.desenharMapa(controller.model.getMapa());
 //       controller.mainview.criarJList(model.getModelo());
        controller.mainview.setVisible(true);
    }
}
