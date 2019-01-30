/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gusta
 */
public class RotasTest {
    Rotas aux;
    Cidade a;
    Cidade b;
        
    @Before
    public void setUp() {
        a = new Cidade(0, 0, "Feira de Santana");
        b = new Cidade(40, 20, "Serrinha");
        aux = new Rotas(a, b, 15);
    }
    
    

    /**
     * Test of getOrigem method, of class Rotas.
     */
    @Test
    public void testGetOrigem() {
        assertEquals(a, aux.getOrigem());
    }

   

    /**
     * Test of getDestino method, of class Rotas.
     */
    @Test
    public void testGetDestino() {
       assertEquals(b, aux.getDestino());
    }



    /**
     * Test of getDistancia method, of class Rotas.
     */
    @Test
    public void testGetDistancia() {
        assertEquals(15, aux.getDistancia());
    }

    /**
     * Test of equals method, of class Rotas.
     */
    @Test
    public void testEquals() {
        Rotas ref = new Rotas(b, a, 15);
        Rotas ref1 = new Rotas(a, b, 15);
        
        assertTrue(aux.equals(ref));
        assertTrue(aux.equals(ref1));
    }
    
}
