public class CaixaEletronicoMain {


    public static void main(String[] args) {
        //Cedulas disponiveis no caixa eletronico
        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};
        //Quantidade total de cedulas entregues ao cliente
        int quantidadeTotal = 0;
        //valor a ser sacado pelo cliente
        int valorReais = 163;
        //Percorrendo todas as cedulas disponiveis no caixa eletronico
        for (int i = 0; i < cedulas.length; i++) {
            //Quantidade de cedulas para o valor cedulas[i]
            int quantidadeCedulas = valorReais / cedulas[i];
            //Impressao da quantidade de cedulas
            System.out.println("Quantidadde de cedulas de " + cedulas[i] + ": " + quantidadeCedulas);
            //Resto da divisao
            valorReais %= cedulas[i];
            //Quantidade total de cedulas entregues ao cliente
            quantidadeTotal += quantidadeCedulas;
        }
        //Impressao
        System.out.println("Quantidade total: " + quantidadeTotal);
    }
}


