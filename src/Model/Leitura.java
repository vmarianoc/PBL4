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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class Leitura {

    File f1;
    Mapa mapa;

    public Leitura() {
        f1 = new File(".\\Arquivos\\Mapa.txt");
    }

    public Mapa readFile() throws FileNotFoundException, IOException {
        /*
        Faz a leitura do arquivo linha a linha, 
        Divide o que foi lido em strings menores que vai integrar os dados necessários para criar duas novas cidades e uma rota
        Coloca essa cidade numa estrutura de dados de uma cidade que armazena varias cidades e em outra que armazenam as rotas
        Fecha arquivo
        Retorna o mapa
         */
        String array[];
        Cidade nova;
        Cidade nova2;
        String cidade;
        mapa = new Mapa();
        try {
            FileReader arq = new FileReader(f1);
            BufferedReader lerArq = new BufferedReader(arq);
            while ((cidade = lerArq.readLine()) != null) {
                array = cidade.split(";");

                //Separação das duas cidades.
                nova = dadosCidade(array[3], array[4], array[0]);
                nova2 = dadosCidade(array[5], array[6], array[1]);
                //adição das cidades e rotas. Verificação de repetição feita no mapa.
                mapa.add(nova);
                mapa.add(nova2);
                mapa.add_rota(nova, nova2, array[2]);

            }
        } catch (FileNotFoundException e) {
            throw e;
        }
        return mapa;
    }

    private Cidade dadosCidade(String x, String y, String nome) {
        /*
        Método recebe uma linha inteira, divide os dados e coloca em uma cidade
         */
        Cidade cidade;
        int a;
        int b;
        a = Integer.parseInt(x.trim());
        b = Integer.parseInt(y.trim());
        cidade = new Cidade(a, b, nome.trim());
        return cidade;
    }
}
