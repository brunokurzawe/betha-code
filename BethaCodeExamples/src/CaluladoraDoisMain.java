public class CaluladoraDoisMain {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.calcular(10, 10);

        calculadora.calcular(10.3, 10.2);

        calculadora.calcular("10", "10");
    }


    public static class Calculadora {

        public Double calcular(double a, double b) {
            Double soma = a + b;
            System.out.println("Soma: " + soma);
            return soma;
        }

        public Double calcular(Integer a, Integer b) {
            return calcular(Double.parseDouble(a.toString()), Double.parseDouble(b.toString()));
        }

        public Double calcular(String a, String b) {
            return calcular(Double.parseDouble(a), Double.parseDouble(b));
        }
    }
}
