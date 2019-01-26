/** *****************************************************************************
 * Autores: Vitor Cordeiro e Gustavo Mendes
 * Componente Curricular: MI - Programação II
 * Concluido em: 08/02/2018
 * Declaramos que este código foi elaborado por nós de forma individual e não contém nenhum
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
 * Testes de unidade para a classe {@link Cidade}
 *
 * @author Gustavo e Vitor
 */
public class CidadeTest {

    Cidade aux;

    /**
     * Este método é executado antes de cada teste de unidade e serve para criar
     * uma cidade auxiliar que será utilizada nos testes.
     */
    @Before
    public void setUp() {
        aux = new Cidade(0, 0, "Feira de Santana");
    }

    /**
     * Este teste de unidade serve para verificar se as coordenadas estão sendo
     * armazenadas corretamente.
     */
    @Test
    public void testGetXY() {
        assertEquals(0, aux.getX());
        assertEquals(0, aux.getY());
    }

    /**
     * Este teste de unidade serve para verificar se as coordenadas estão sendo
     * modificados corretamente.
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
     * Este teste de unidade serve para verificar se o nome da cidade foi
     * armazenado corretamente.
     */
    @Test
    public void testGetNome() {
        assertEquals("Feira de Santana", aux.getNome());
    }

    /**
     * Este teste de unidade serve para verificar se uma outra cidade é
     * adicionada corretamente na lista de cidades adjacentes.
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
     * Este teste de unidade serve para verificar se uma cidade é adicionada
     * como um atributo de cidade anterior.
     */
    @Test
    public void testAnterior() {
        Cidade b = new Cidade(40, 20, "Serrinha");
        assertEquals(null, aux.getAnterior());
        aux.setAnterior(b);
        assertEquals(b, aux.getAnterior());
    }

    /**
     * Este teste de unidade serve para verificar se o atributo peso é está
     * sendo escrito corretamente.
     */
    @Test
    public void testPeso() {
        assertEquals(0, aux.getPeso());
        aux.setPeso(20);
        assertEquals(20, aux.getPeso());
    }

}
