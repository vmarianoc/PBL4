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
public class LeituraTest {
    Leitura aux;
    Cidade a;
    Cidade b;
    Cidade c;
    Cidade d;
    
    @Before
    public void setUp() {
        aux = new Leitura();
        a = new Cidade(0, 0, "Feira de Santana");
        b = new Cidade(100, 0, "Salvador");
        c = new Cidade(800, 200, "Abaira");
        d = new Cidade(100, 200, "Acajutiba");
    }
    
    /**
     * Test of readFile method, of class Leitura.
     * @throws java.lang.Exception
     */
    @Test
    public void testReadFile() throws Exception {
       Iterator it;
       Mapa ref = aux.readFile();
       it = ref.getCidades();
       
       assertTrue(it.hasNext());
       assertEquals(a, it.next());
       
       assertTrue(it.hasNext());
       //assertEquals(b, it.next());
       it.next();
       
       assertTrue(it.hasNext());
       assertEquals(c, it.next());
       
       assertTrue(it.hasNext());
       assertEquals(d, it.next());
       assertFalse(it.hasNext());
    }
    
}
