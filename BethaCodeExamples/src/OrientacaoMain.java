public class OrientacaoMain {

    public static void main(String[] args) {

        Animal animal = new Animal("Toto",0.47,20.1,"auau");


        animal.emitirSom();
        animal.pular(10.0);
    }

    public static class Animal {
        private String nome;
        private Double altura;
        private Double peso;
        private String som;

        public Animal(String nome, Double altura, Double peso, String som){
            this.nome = nome;
            this.altura = altura;
            this.peso = peso;
            this.som = som;
        }

        public void emitirSom() {
            System.out.println("O animal faz: " + som);
        }

        public void pular(Double alturaPulo) {
            System.out.println("O animal pula nessa " + alturaPulo + "altura!");
        }
    }


    public static class Pessoa {
        String nome;
        Double altura;
        Double peso;

        public Double getImcDouble() {
            return peso / (altura * altura);
        }

        public void getImc() {
            double imc = peso / (altura * altura);
            System.out.println("IMC de " + nome + " é " + imc);
        }

        public void academia() {
            peso = peso - 1;
            System.out.println("Novo peso de " + nome + " é " + peso);
        }

        public void churrascaria() {
            peso = peso + 1;
            System.out.println("Novo peso de " + nome + " é " + peso);
        }

        public void liposaspiracao() {
            peso = peso - 20;
            System.out.println("Novo peso de " + nome + " é " + peso);
        }


    }
}
