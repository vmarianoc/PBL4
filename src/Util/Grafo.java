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
package Util;

import Model.Cidade;
import Model.Rotas;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsavel pelo comportamento de um Grafo.
 *
 * @author Vitor e Gustavo
 */
public class Grafo {

    private List<Cidade> _cidades;
    private List<Rotas> _rotas;

    public Grafo() {
        _cidades = new ArrayList<>();
        this._rotas = new ArrayList<>();
    }

    public void adicionaVertice(int x, int y, String nome) {
        Cidade cidade = new Cidade(x, y, nome);
        _cidades.add(cidade);
    }

    public void adicionaAresta(Cidade inicio, Cidade fim, int distancia) {
        /*
        Cria e adiciona uma rota(Aresta) no grafo
         */
        Rotas rota = new Rotas(inicio, fim, distancia);
        inicio.adicionaAdj(rota);
        _rotas.add(rota);

        //Coloca do fim para o inico
        Rotas rotasAdj = new Rotas(inicio, fim, distancia);
        fim.adicionaAdj(rotasAdj);
        _rotas.add(rotasAdj);
    }

    /*
    Verifica se existe alguma cidade com aquelas cidades
     */
    private Rotas existeRotasComAsCidades(Cidade fim, Cidade inicio) {
        for (Rotas rotas : _rotas) {
            if (rotas.getOrigem().equals(fim) && rotas.getDestino().equals(inicio)) {
                return rotas;
            }
        }
        return null;
    }

}
