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

/**
 *
 * @author vitor
 */
public class Rotas {

    private Cidade origem;
    private Cidade destino;
    private int distancia;

    public Rotas(Cidade origem, Cidade destino, int distancia) {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
    }

    public Cidade getOrigem() {
        return origem;
    }

    public void setOrigem(Cidade origem) {
        this.origem = origem;
    }

    public Cidade getDestino() {
        return destino;
    }

    public void setDestino(Cidade destino) {
        this.destino = destino;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rotas) {
           Rotas aux = (Rotas) obj;
           return aux.getDestino().equals(this.destino) && aux.getOrigem().equals(this.origem) && aux.getDistancia() == this.distancia || aux.getDestino().equals(this.origem) && aux.getOrigem().equals(this.destino) && aux.getDistancia() == this.distancia;
        }
        return false;
    }
}

