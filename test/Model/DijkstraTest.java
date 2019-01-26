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

import java.io.IOException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testes de unidade para a classe {@link Dijkstra}.
 *
 * @author Vitor e Gustavo
 */
public class DijkstraTest {

    Cidade nova;
    Cidade nova2;
    Mapa a;
    Leitura b;
    Dijkstra aux;

    /**
     * Este método é executado antes de cada teste de unidade e serve para criar
     * cidades auxiliares que serão utilizadas nos testes.
     *
     * @throws IOException
     */
    @Before
    public void setUp() throws IOException {
        nova = new Cidade(0, 0, "Feira de Santana");
        nova2 = new Cidade(100, 200, "Acajutiba");
        b = new Leitura();
        a = b.readFile();
        aux = new Dijkstra(a.getLista());
    }

    /**
     * Este teste de unidade serve para verificar se o caminho criado foi
     * realmente o menor.
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
