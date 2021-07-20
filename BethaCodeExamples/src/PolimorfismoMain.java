public class PolimorfismoMain {


    public static void main(String[] args) {
        Veiculo veiculo = VeiculoBuilder.criaVeiculo("CARRO");
        veiculo.ligar();
    }

    public static class VeiculoBuilder {
        public static Veiculo criaVeiculo(String veiculo) {
            if (veiculo.equals("ONIBUS")) {
                return new Onibus();
            } else if (veiculo.equals("MOTO")) {
                return new Moto();
            }
            return new Carro();
        }
    }

    public static class Veiculo {
        public void ligar() {
            System.out.println("Veiculo ligando!!");
        }
    }

    public static class Carro extends Veiculo {
        @Override
        public void ligar() {
            System.out.println("Carro ligando!!");
        }
    }

    public static class Onibus extends Veiculo {
        @Override
        public void ligar() {
            System.out.println("Onibus ligando!!");
        }
    }

    public static class Moto extends Veiculo {
        @Override
        public void ligar() {
            System.out.println("Moto ligando!!");
        }
    }
}
