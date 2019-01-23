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

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author vitor
 */
public class Mapa {

    private LinkedList<Cidade> mapa;

    public Mapa() {
        mapa = new LinkedList<>();
    }
    
    //Adiciona uma cidade ao mapa caso ela ainda não exista.
    public void add(Cidade e) {
        if (!mapa.contains(e)) {
            mapa.add(e);
        }
    }
    
    /**
     * Metodo responsavel por adicionar as rotas as cidades. Busca em uma lista
     * a cidade origem ou destino e então adiciona a rota a esta cidade caso
     * encontre.
     * @param origem
     * @param destino
     * @param distancia
     **/
    public void add_rota(Cidade origem, Cidade destino, String distancia) {
        Iterator it = mapa.iterator();
        Cidade p;
        int x;
        x = Integer.parseInt(distancia.trim());
        Rotas aux = new Rotas(origem, destino, x);
        while(it.hasNext()){
            p = (Cidade) it.next();
            if(p.equals(origem) || p.equals(destino)){
                p.adicionaAdj(aux);
            }
        }
    }
    
    public Iterator getCidades(){
        return mapa.iterator();
    }
    
    public LinkedList<Cidade> getLista(){
        return mapa;
    }
}
