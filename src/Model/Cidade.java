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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Essa classe implementa um comportamento de uma Cidade. Por isso, possui
 * atributos como coordenadas e nome, além de outros auxiliares como Adjacente,
 * se ela está selecionada
 *
 * @author Vitor e Gustavo
 */
public class Cidade {

    private Cidade anterior;
    private int peso;
    private int x;
    private int y;
    private String nome;
    private boolean selecionado;
    private List<Rotas> adjacente;

    public Cidade(int x, int y, String nome) {
        this.x = x;
        this.y = y;
        this.nome = nome;
        adjacente = new LinkedList<>();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isSelecionado() {
        return selecionado;
    }

    public void setSelecionado(boolean selecionado) {
        this.selecionado = selecionado;
    }

    public void adicionaAdj(Rotas rota) {
        if (!adjacente.contains(rota)) {
            adjacente.add(rota);
        }
    }

    public void setAnterior(Cidade a) {
        anterior = a;
    }

    public Cidade getAnterior() {
        return anterior;
    }

    public void setPeso(int valor) {
        peso = valor;
    }

    public int getPeso() {
        return peso;
    }

    public Iterator getAdjacente() {
        return adjacente.iterator();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cidade) {
            Cidade aux = (Cidade) obj;
            return x == aux.getX() && y == aux.getY() && this.nome.equals(aux.getNome());
        }
        return false;
    }
}
