//import javax.swing.*;
//import java.math.RoundingMode;
//import java.text.DecimalFormat;
//import java.util.Scanner;
//
//public class ExerciciosDesafioTresMain {
//
//    public static void main(String[] args) {
//
//
//        //1 - Crie um programa que percorra um array de 10 posições e imprima o seu conteúdo.
//        double array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 1; i <= array.length; i++) {
//            System.out.println(i);
//        }
//
//
//        //2 - Escreva um programa que some todos os valores contidos em um array de inteiros e calcule a média.
//
//        double note[] = {4, 5, 6, 7};
//        double soma = 0;
//        double media = 0;
//
//        for (int i = 0; i < note.length; i++) {
//            soma = soma + note[i];
//        }
//
//        media = soma / note.length;
//        System.out.println("Média: " + media);
//
//
//        //3 - Faça um programa que inverta as posições de um array com 10 elementos.
//
//        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        for (int i = a.length - 1; i >= 0; i--) {
//            System.out.println("Array invertido: " + a[i]);
//        }
//
//
//        //4 - Faça um programa que receba entrada de dados  e informe ao usuário através de
//        // uma caixa de diálogo qual foi o dados passados.
//
//
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Informe seu nome: ");
//        String nome = s.nextLine();
//        System.out.println("Informe sua idade:");
//        int idade = s.nextInt();
//        System.out.println("Informe o nome da cidade que você mora: ");
//        String cidade = s.next();
//
//        String mensagem = nome +
//                " tem " + idade + " anos e mora em " + cidade;
//        JOptionPane.showMessageDialog(null, mensagem);
//
//
//        //5 - Desenvolva um programa que receba 10 parâmetros, inverta todas as posições e imprima o resultado.
//        int[] posicoes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        for (int i = 0; i < posicoes.length; i++) {
//            System.out.println(posicoes[i]);
//        }
//        System.out.println("Ordem invertida: ");
//        for (int v = posicoes.length - 1; v >= 0; v--) {
//            System.out.println(posicoes[v]);
//        }
//
//
//        //6 - Desenvolva um programa que calcule o IMC com telas gráficas usando JOptionPane.
//
//        String peso;
//        //Este comando mostra um dialogo que solicita entrada de dados
//        peso = JOptionPane.showInputDialog("Digite o seu peso: ");
//
//        String altura;
//        //Este comando mostra um dialogo que solicita entrada de dados
//        altura = JOptionPane.showInputDialog("Digite a sua altura: ");
//
//        double pesoDecimal = Double.parseDouble(peso);
//        double alturaDecimal = Double.parseDouble(altura);
//
//        double imc = pesoDecimal / (alturaDecimal * alturaDecimal);
//
//        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
//        decimalFormat.setRoundingMode(RoundingMode.DOWN);
//
//        //String imcFinal = Double.toString(imc);
//
//        JOptionPane.showMessageDialog(null, "IMC é: " + decimalFormat.format(imc));
//
//
//    }
//}
// pessoa.getImc();
//
//         if (pessoa.getImcDouble() > 30){
//         System.out.println("gordinho!");
//         }
//
//         pessoa.academia();
//         pessoa.churrascaria();
//         pessoa.academia();
//         pessoa.academia();
//         pessoa.academia();
//         pessoa.liposaspiracao();
//         pessoa.getImc();
//
//         Pessoa pessoa1 = new Pessoa();
//         pessoa1.nome = "Paula";
//         pessoa1.altura = 1.60;
//         pessoa1.peso = 55.0;
//
//         pessoa1.getImc();
//
//         pessoa1.getImc();
//
//         if (pessoa.getImcDouble() > 30){
//         System.out.println("gordinho!");
//         }
//
//         if (pessoa1.getImcDouble() > 30){
//         System.out.println("gordinho!");
//         }