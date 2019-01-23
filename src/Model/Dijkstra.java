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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Classe responsavel por Calcular o menor caminho.
 *
 * @author Vitor e Gustavo
 */
public class Dijkstra {

    private ArrayList<Cidade> menor_caminho;
    private LinkedList nao_visitados;
    private LinkedList<Cidade> visitados;
    private Cidade atual;

    public Dijkstra(LinkedList<Cidade> aux) {
        nao_visitados = aux;
        menor_caminho = new ArrayList<>();
        visitados = new LinkedList<>();
    }

    /**
     * Metodo que realiza o algoritmo de Dijkstra.
     *
     * @param origem
     * @param destino
     * @return
     */
    public ArrayList caminho(Cidade origem, Cidade destino) {
        Cidade aux = null;
        Iterator it;
        ComparaCidade c = new ComparaCidade();
        menor_caminho.add(origem);
        nao_visitados = infinito(nao_visitados, origem);
        while (!nao_visitados.isEmpty()) {
            atual = (Cidade) nao_visitados.get(0);
            nao_visitados.remove(0);
            visitados.add(atual);
            alteraPeso(nao_visitados, atual);
            Collections.sort(nao_visitados, c);
        }
        it = visitados.iterator();
        while (it.hasNext()) {
            aux = (Cidade) it.next();
            if (aux.equals(destino)) {
                break;
            }
        }
        menor_caminho = retornaRota(menor_caminho, aux);
        return menor_caminho;
    }

    /**
     * Método que retorna a cidade anterior.
     *
     * @param a
     * @param b
     * @return
     */
    private ArrayList retornaRota(ArrayList a, Cidade b) {
        Cidade aux = b;
        while (aux.getAnterior() != null) {
            a.add(aux);
            aux = aux.getAnterior();
        }
        return a;
    }

    /**
     * Coloca o elemento de origem com peso 0 e todos os outros elementos da
     * lista em infinito.
     *
     * @param cidades
     * @param origem
     * @return
     */
    private LinkedList infinito(LinkedList<Cidade> cidades, Cidade origem) {
        ComparaCidade c = new ComparaCidade();
        for (Cidade cidade : cidades) {
            if (cidade.equals(origem)) {
                cidade.setPeso(0);
            } else {
                cidade.setPeso(9999);
            }
        }
        Collections.sort(cidades, c);
        return cidades;
    }

    /**
     * Altera o peso das Cidades para uma estimatva do peso delas.
     *
     * @param a
     * @param b
     */
    private void alteraPeso(LinkedList a, Cidade b) {
        Cidade auxC;
        Cidade ref;
        Rotas auxR;
        Iterator it = b.getAdjacente();
        while (it.hasNext()) {
            auxR = (Rotas) it.next();
            ref = getCidade(auxR, b);
            auxC = getCLista(a, ref);
            if (auxC != null) {
                if (auxC.getPeso() > auxR.getDistancia() + b.getPeso()) {
                    auxC.setPeso(auxR.getDistancia() + b.getPeso());
                    auxC.setAnterior(b);
                }
            }
        }
    }

    /**
     * Retorna a Cidade da Lista.
     *
     * @param a
     * @param b
     * @return
     */
    private Cidade getCLista(LinkedList a, Cidade b) {
        Iterator it = a.listIterator();
        Cidade aux;
        while (it.hasNext()) {
            aux = (Cidade) it.next();
            if (aux.equals(b)) {
                return aux;
            }
        }
        return null;
    }

    /**
     * Retorna a cidade diferente da atual cidade passada.
     *
     * @param a
     * @param b
     * @return
     */
    private Cidade getCidade(Rotas a, Cidade b) {
        if (a.getDestino().equals(b)) {
            return a.getOrigem();
        } else {
            return a.getDestino();
        }
    }

    /**
     * Classe que compara duas cidades pelo peso. Utilizado na ordenação da
     * lista
     */
    private class ComparaCidade implements Comparator {

        @Override
        public int compare(Object o1, Object o2) {
            Cidade a1 = (Cidade) o1;
            Cidade a2 = (Cidade) o2;
            if (a1.getPeso() > a2.getPeso()) {
                return 1;
            } else if (a1.getPeso() < a2.getPeso()) {
                return -1;
            } else {
                return 0;
            }
        }

    }

}
