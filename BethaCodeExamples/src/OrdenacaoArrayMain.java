import java.util.Arrays;

public class OrdenacaoArrayMain {
    public static void main(String[] args) {
        //Criacao do array de 10.000 posicoes
        int[] arrayInteiros = new int[10000];
        //Atribuindo os valores a cada posicao
        for (int i = 10000; i > 0; i--) {
            arrayInteiros[arrayInteiros.length - i] = i;
        }
        //inicio do algoritmo de ordenacao - implementado
        boolean estaOrdenado = false;
        //armazena o tempo de inicio da ordenacao
        long inicio = System.currentTimeMillis();
        while (!estaOrdenado) {
            estaOrdenado = true;
            for (int i = 1; i < arrayInteiros.length; i++) {
                if (arrayInteiros[i - 1] > arrayInteiros[i]) {
                    estaOrdenado = false;
                    int aux = arrayInteiros[i];
                    arrayInteiros[i] = arrayInteiros[i - 1];
                    arrayInteiros[i - 1] = aux;
                }
            }
        }
        //armazena o tempo fim da ordenacao
        long fim = System.currentTimeMillis();
        //Imprime o tempo total de ordenacao
        System.out.println("Tempo ordenar 1: " + (fim - inicio) + " ms");
        //Atribuindo os valores a cada posicao
        for (int i = 10000; i > 0; i--) {
            arrayInteiros[arrayInteiros.length - i] = i;
        }
        //armazena o tempo de inicio da ordenacao
        inicio = System.currentTimeMillis();
        //Ordena utilizando a classe Arrays
        Arrays.sort(arrayInteiros);
        //armazena o tempo fim da ordenacao
        fim = System.currentTimeMillis();
        //Imprime o tempo total de ordenacao
        System.out.println("Tempo ordenar 2: " + (fim - inicio) + " ms");
    }
}