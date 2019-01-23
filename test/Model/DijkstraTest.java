/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.IOException;
import java.util.ArrayList;
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
public class DijkstraTest {
    Cidade nova;
    Cidade nova2;
    Mapa a;
    Leitura b;
    Dijkstra aux;
        
    @Before
    public void setUp() throws IOException {
        nova = new Cidade(0, 0, "Feira de Santana");
        nova2 = new Cidade(100, 200, "Acajutiba");
        b = new Leitura();
        a = b.readFile();
        aux = new Dijkstra (a.getLista());
    }
    

    /**
     * Test of caminho method, of class Dijkstra.
     */
    @Test
    public void testCaminho() {
        ArrayList<Cidade> ref;
        
        ref = aux.caminho(nova, nova2);
        
        assertFalse(ref.isEmpty());
        
        assertEquals(3, ref.size());
        
        assertEquals(nova, ref.get(0));
        
        assertEquals(nova2, ref.get(1));
    }
    
}
