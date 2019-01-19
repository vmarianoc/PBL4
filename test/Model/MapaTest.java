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
public class MapaTest {
    
    public MapaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class Mapa.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Cidade e = null;
        Mapa instance = new Mapa();
        instance.add(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add_rota method, of class Mapa.
     */
    @Test
    public void testAdd_rota() {
        System.out.println("add_rota");
        Cidade origem = null;
        Cidade destino = null;
        String distancia = "";
        Mapa instance = new Mapa();
        instance.add_rota(origem, destino, distancia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCidades method, of class Mapa.
     */
    @Test
    public void testGetCidades() {
        System.out.println("getCidades");
        Mapa instance = new Mapa();
        Iterator expResult = null;
        Iterator result = instance.getCidades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
