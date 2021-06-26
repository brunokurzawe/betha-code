import java.util.Arrays;

public class PesquisarArrayMain {
    public static void main(String[] args) {
        //Criacao do array de 1.000.000 de posicoes
        int[] numerosInteiros = new int[1000000];
        //Definicao do numero a ser pesquisado
        int numeroPesquisado = 555000;
        //Preenchimento do Array
        for(int i = 0; i < 1000000; i++)
            numerosInteiros[i] = i;
        //Inicio da contagem do tempo
        long inicio = System.currentTimeMillis();
        //Percorrendo o array em busca do numero
        for(int i = 0; i < 1000000; i++)
        {
            if(numerosInteiros[i] == numeroPesquisado)
                break;
        }
        //fim da contagem do tempo
        long fim = System.currentTimeMillis();
        //Imprime o tempo total de pesquisa
        System.out.println("Pesquisa 1: "+(fim-inicio)+" ms");
        //Inicia a contagem do tempo
        inicio = System.currentTimeMillis();

        //Faz a pesquisa utilizando a classe Arrays
        Arrays.binarySearch(numerosInteiros, numeroPesquisado);
        //Fim da contagem do tempo
        fim = System.currentTimeMillis();
        //Imprime o tempo total de pesquisa
        System.out.println("Pesquisa 2: "+(fim-inicio)+" ms");
    }
}