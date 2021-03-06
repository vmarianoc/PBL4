/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cidade;
import Model.Rotas;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author vitor
 */
public class DesenhaGrafo extends javax.swing.JFrame {

    int width;
    int height;
    ArrayList<Cidade> nodes;
    ArrayList<Rotas> edges;
            
    /**
     * Creates new form DesenhaGrafo
     */
    public DesenhaGrafo() {
        initComponents();
        nodes = new ArrayList<Cidade>();
        edges = new ArrayList<Rotas>();
        height = 30;
        width = 30;
    }
    
    public DesenhaGrafo(String name) {
        initComponents();
        this.setTitle(name);
        nodes = new ArrayList<Cidade>();
        edges = new ArrayList<Rotas>();
        height = 30;
        width = 30;
    }
    
    public void adicionaCidade(Cidade e){
        nodes.add(e);
        this.repaint();
    }
    
    public void adicionaRotas(Rotas r){
        edges.add(r);
        this.repaint();
    }
    
    public void paint(Graphics g){
        FontMetrics f = g.getFontMetrics();
        int nodeHeight = Math.max(height, f.getHeight());
        
        g.setColor(Color.black);
        for(Rotas e: edges){
            g.drawLine(nodes.get(e.getOrigem().getX()), nodes.get(e.getOrigem().getY()), nodes.get(e.getDestino().getX()), nodes.get(e.getDestino().getY()));
        }
        
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 842, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DesenhaGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesenhaGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesenhaGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesenhaGrafo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesenhaGrafo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
