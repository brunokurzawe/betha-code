public class SobrecargaTipoOrdemMain {

    public static void main(String[] args) {
        CalculadoraImc calculadora = new CalculadoraImc();

        Double imc = calculadora.getImc(10, 2.5);
        System.out.println(imc);

        Double imc2 = calculadora.getImc(10.5, 2);
        System.out.println(imc2);

    }


    public static class CalculadoraImc {
        private Double altura;
        private Integer peso;

        public Double getAltura() {
            return altura;
        }

        public Integer getPeso() {
            return peso;
        }

        public Double getImc() {
            return peso / (altura * altura);
        }

        public Double getImc(Integer peso, Double altura) {
            return peso / (altura * altura);
        }

        public Double getImc(Double altura, Integer peso) {
            return peso / (altura * altura);
        }

    }
}
