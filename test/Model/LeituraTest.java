/** *****************************************************************************
 * Autor: Vitor Cordeiro e Gustavo Mendes
 * Componente Curricular: MI - Programação II
 * Concluido em: 08/02/2018
 * Declaro que este código foi elaborado por mim de forma individual e não contém nenhum
 * trecho de código de outro colega ou de outro autor, tais como provindos de livros e
 * apostilas, e páginas ou documentos eletrônicos da Internet. Qualquer trecho de código
 * de outra autoria que não a minha está destacado com uma citação para o autor e a fonte
 * do código, e estou ciente que estes trechos não serão considerados para fins de avaliação.
 ***************************************************************************************** */

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
       assertEquals(b, it.next());
       
       assertTrue(it.hasNext());
       assertEquals(c, it.next());
       
       assertTrue(it.hasNext());
       assertEquals(d, it.next());
       assertFalse(it.hasNext());
    }
    
}
