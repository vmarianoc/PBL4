/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gusta
 */
public class VeiculosTest {
    Veiculos aux;
    
    @Before
    public void setUp() {
        aux = new Veiculos("Corola", 12.5);
    }
    
    
    @Test
    public void testGetNome() {
        assertEquals("Corola", aux.getNome());
    }


    /**
     * Test of getConsumo method, of class Veiculos.
     */
    @Test
    public void testGetConsumo() {
        assertEquals(12.5, aux.getConsumo(), 0);
    }

  
    
}
