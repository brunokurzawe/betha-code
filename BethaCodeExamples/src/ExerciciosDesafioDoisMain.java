import java.util.Scanner;

public class ExerciciosDesafioDoisMain {

    public static void main(String[] parametros) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do exercicio: ");
        int exercicio = scanner.nextInt();

        switch (exercicio) {
            case 1:
                System.out.println("Resolução Exercicio 01");
                System.out.print("Digite um número de 1 a 7: ");
                int numero = scanner.nextInt();

                /*
                 * Solução proposta numero 01
                 * */
                switch (numero) {
                    case 1:
                        System.out.println("Domingo");
                        break;
                    case 2:
                        System.out.println("Segunda");
                        break;
                    case 3:
                        System.out.println("Terça");
                        break;
                    case 4:
                        System.out.println("Quarta");
                        break;
                    case 5:
                        System.out.println("Quinta");
                        break;
                    case 6:
                        System.out.println("Sexta");
                        break;
                    case 7:
                        System.out.println("Sexta");
                        break;
                    default:
                        System.out.println("Dia da semana inexistente!");
                        break;
                }

                /*
                 * Solução proposta numero 02
                 * */
                if (numero == 1) {
                    System.out.println("Domingo");
                } else if (numero == 2) {
                    System.out.println("Segunda");
                } else if (numero == 3) {
                    System.out.println("Terça");
                } else if (numero == 4) {
                    System.out.println("Quarta");
                } else if (numero == 5) {
                    System.out.println("Quinta");
                } else if (numero == 6) {
                    System.out.println("Sexta");
                } else if (numero == 7) {
                    System.out.println("Sabado");
                } else {
                    System.out.println("Dia da semana inexistente!");
                }
                break;
            case 2:
                System.out.println("Resolução Exercicio 02");

                /*
                 * Solução proposta numero 01
                 * */
                int y = 1;
                int x = 10;

                while (y <= 20) {
                    y++;
                    System.out.println(x);
                    x++;
                }

                /*
                 * Solução proposta numero 02
                 * */
                boolean executa = true;
                int w = 10;
                while (executa) {
                    System.out.println(">>" + w);
                    if (w == 29) executa = false;
                    w++;
                }

                /*
                 * Solução proposta numero 03
                 * */
                int v = 10;

                while (v < 30) {
                    System.out.println(">>>>" + v);
                    v++;
                }
                break;
            case 3:
                System.out.println("Resolução Exercicio 03");

                /*
                 * Solução proposta numero 01
                 * */
                Integer a = 1;
                Integer b = 10;

                do {
                    a++;

                    System.out.println(b);

                    b++;
                } while (a <= 20);

                /*
                 * Solução proposta numero 02
                 * */
                int e = 10;

                do {
                    System.out.println(">>" + e);
                    e++;
                } while (e < 30);

                /*
                 * Solução proposta numero 03
                 * */
                boolean executa1 = true;
                int o = 10;
                do {
                    System.out.println(">>>>" + o);
                    if (o == 29) executa1 = false;
                    o++;
                } while (executa1);

                break;

            case 4:
                System.out.println("Resolução Exercicio 04");

                System.out.println("Digite um número de até 4 dígitos:");
                String numeroInverterNovo = scanner.next();

                /*
                 * Solução proposta numero 01
                 * */
                String invertido = "";
                for (int i = numeroInverterNovo.length() - 1; 0 <= i; i--) {
                    invertido += numeroInverterNovo.charAt(i);
                }
                System.out.println(invertido);

                /*
                 * Solução proposta numero 02
                 * */
                String numeroInvertido2 = "";
                for (int i = numeroInverterNovo.length(); i > 0; i--) {
                    numeroInvertido2 += numeroInverterNovo.substring(i - 1, i);
                }
                System.out.println(">>" + numeroInvertido2);

                /*
                 * Solução proposta numero 03
                 * */
                int invertidoX = 0;
                int numeroX = Integer.parseInt(numeroInverterNovo);
                while (numeroX != 0 ) {
                    invertidoX = invertidoX * 10;
                    invertidoX = invertidoX + (numeroX%10);
                    numeroX = numeroX/10;
                }
                System.out.println("Invertido: " + invertidoX);

                /*
                 * Solução proposta numero 04
                 * */
                int inv = 0;
                int numeroS = Integer.parseInt(numeroInverterNovo);
                while (numeroS > 0) {
                    inv = 10 * inv + numeroS % 10;
                    numeroS /= 10;
                }
                System.out.println(">>>>>>"+inv);

                break;
            case 5:
                System.out.println("Resolução Exercicio 05");

                /*
                 * Solução proposta numero 01
                 * */
                double h = 1.50;
                double b1 = 1.20;
                double B = 1.80;
                double area = (h * (b1 + B)) / 2;
                System.out.println("imprime: Area trapezio:" + area);

                /*
                 * Solução proposta numero 02
                 * */
                System.out.print("Informe a altura do trapézio: ");
                float altura = scanner.nextFloat();
                System.out.print("Informe a base menor do trapézio: ");
                float baseMenor = scanner.nextFloat();
                System.out.print("Informe a base maior do trapézio: ");
                float baseMaior = scanner.nextFloat();

                float areaTrapezio = 0;
                if (baseMenor < baseMaior) {
                    //Fórmula: Área = (h.(b+B))/2
                    areaTrapezio = (altura * (baseMenor + baseMaior)) / 2;
                    System.out.println("Área do trapézio: " + areaTrapezio);
                } else {
                    System.out.println("Valores das bases não conferem!");
                }

                System.out.println("            b");
                System.out.println("      ______________");
                System.out.println("     /|             \\");
                System.out.println("    / |              \\         b = base menor");
                System.out.println("   /  | h             \\        h = altura");
                System.out.println("  /   |                \\       B = base maior");
                System.out.println(" /    |                 \\");
                System.out.println("/_____|__________________\\");
                System.out.println("             B");

                break;
            case 6:
                System.out.println("Resolução Exercicio 06");
                /*
                 * Solução proposta numero 01
                 * */
                for (int i = 15; i <= 35; i++) {
                    if (i%2 == 0) {
                        continue;
                    }
                    System.out.println(i + " >> " + (int) i * i);
                }

                /*
                 * Solução proposta numero 02
                 * */
                for (int i = 15; i <= 35; i++) {
                    if (i%2 == 0) {
                        continue;
                    }
                    System.out.println(i + " >>>> " + (int) Math.pow(i, 2));
                }

                /*
                 * Solução proposta numero 03
                 * */
                for (int xa = 15; xa <= 35; xa++) {
                    if (xa % 2 != 0) {
                        int ya = 0;
                        ya = (xa * xa);
                        System.out.println(xa + " é um número ímpar e o seu quadrado é " + ya);
                    } else {		//retirando esse else, não imprime os números pares
                        System.out.println(xa + " é um número par");
                    }
                }

                /*
                 * Solução proposta numero 04
                 * */
                int ia = 15;
                while (ia<=35) {
                    if (ia%2!=0) {
                        System.out.println("O quadrado do número " + ia + " é igual a "+ ia*ia);
                    }
                    ia++;
                }

                break;
            default:
                System.out.println("Exercicio Invalido");
        }


    }
}
