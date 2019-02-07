/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.TelaRotas;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 *
 * @author gusta
 */
public class Controller {
    private ControlModel model;
    private TelaRotas view;
    
   public Controller() throws IOException{
       model = new ControlModel();
       view = new TelaRotas();
   }
   public static void main(String args[]) throws IOException{
        Controller controller = new Controller();
        controller.view.desenharMapa(controller.model.getMapa());
        controller.view.setVisible(true);
   }
}
