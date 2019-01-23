/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Iterator;
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
public class CidadeTest {

    Cidade aux;

    @Before
    public void setUp() {
        aux = new Cidade(0, 0, "Feira de Santana");
    }

    /**
     * Test of getX method, of class Cidade.
     */
    @Test
    public void testGetXY() {
        assertEquals(0, aux.getX());
        assertEquals(0, aux.getY());
    }

    /**
     * Test of setX method, of class Cidade.
     */
    @Test
    public void testSetXY() {
        assertEquals(0, aux.getX());
        assertEquals(0, aux.getY());
        aux.setX(15);
        aux.setY(50);
        assertEquals(15, aux.getX());
        assertEquals(50, aux.getY());
    }

    /**
     * Test of getNome method, of class Cidade.
     */
    @Test
    public void testGetNome() {
        assertEquals("Feira de Santana", aux.getNome());
    }


    /**
     * Test of adicionaAdj method, of class Cidade.
     */
    @Test
    public void testAdicionaAdj() {
        
        Iterator it;
        Cidade b = new Cidade(40, 20, "Serrinha");
        Rotas nova = new Rotas(aux, b, 20);
        aux.adicionaAdj(nova);
        it = aux.getAdjacente();
        
        assertTrue(it.hasNext());
        assertEquals(nova, it.next());
        assertFalse(it.hasNext());
    }

    /**
     * Test of setAnterior method, of class Cidade.
     */
    @Test
    public void testAnterior() {
       Cidade b = new Cidade(40, 20, "Serrinha");
       assertEquals(null, aux.getAnterior());
       aux.setAnterior(b);
       assertEquals(b, aux.getAnterior());
    }

  

    /**
     * Test of setPeso method, of class Cidade.
     */
    @Test
    public void testPeso() {
        assertEquals(0, aux.getPeso());
        aux.setPeso(20);
        assertEquals(20, aux.getPeso());
    }
    
}
