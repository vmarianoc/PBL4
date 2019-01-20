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
    Mapa aux;
    Cidade a;
    Cidade b;
    Cidade c;
    Cidade d;
    
    @Before
    public void setUp() {
        
        aux = new Mapa();
        a = new Cidade(0, 0, "Feira de Santana");
        b = new Cidade(100, 0, "Salvador");
        c = new Cidade(800, 200, "Abaira");
        d = new Cidade(100, 200, "Acajutiba");
    }
    
    /**
     * Test of add method, of class Mapa.
     */
    @Test
    public void testAdd() {
        Iterator it;
        
        aux.add(a);
        aux.add(b);
        aux.add(c);
        aux.add(d);
        it = aux.getCidades();
        
        assertTrue(it.hasNext());
        assertEquals(a, it.next());
        
        assertTrue(it.hasNext());
        assertEquals(b, it.next());
        
        assertTrue(it.hasNext());
        assertEquals(c, it.next());
        
        assertTrue(it.hasNext());
        assertEquals(d, it.next());
        
        assertFalse(it.hasNext());
    }

    /**
     * Test of add_rota method, of class Mapa.
     */
    @Test
    public void testAdd_rota() {
        Cidade ref;
        Rotas compara;
        Iterator it;
        Iterator it1;
        
        aux.add(a);
        aux.add(b);
        aux.add_rota(a, b, "100");
        it = aux.getCidades();
        
        ref = (Cidade) it.next();
        it1 = ref.getAdjacente();
        
        assertTrue(it1.hasNext());
        compara = (Rotas) it1.next();
        
        assertEquals(a, compara.getOrigem());
        assertEquals(b, compara.getDestino());
        assertEquals(100, compara.getDistancia());
        
        assertFalse(it1.hasNext());
        
        ref = (Cidade) it.next();
        it1 = ref.getAdjacente();
        
        assertTrue(it1.hasNext());
        compara = (Rotas) it1.next();
        
        assertEquals(a, compara.getOrigem());
        assertEquals(b, compara.getDestino());
        assertEquals(100, compara.getDistancia());
    } 

    /**
     * Test of getCidades method, of class Mapa.
     */
    @Test
    public void testGetCidades() {
        Iterator it;
        
        aux.add(c);
        aux.add(d);
        
        it = aux.getCidades();
        
        assertTrue(it.hasNext());
        assertEquals(c, it.next());
        
        assertTrue(it.hasNext());
        assertEquals(d, it.next());
        
        assertFalse(it.hasNext());
    }
    
}
