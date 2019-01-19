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
public class LeituraTest {
    Leitura aux;
    
    @Before
    public void setUp() {
        aux = new Leitura();
    }
    
    /**
     * Test of readFile method, of class Leitura.
     */
    @Test
    public void testReadFile() throws Exception {
       Mapa ref = aux.readFile();
    }
    
}
