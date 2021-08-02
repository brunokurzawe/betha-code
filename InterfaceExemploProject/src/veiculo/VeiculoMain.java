package veiculo;

public class VeiculoMain {
    public interface Veiculo{
        public String getModelo();
        public String getFabricante();
    }

    public interface Motor{
        public String getNome();
        public String getId();
    }

    public static class Moto implements Motor,Veiculo{

        private String marca;
        private String cc;
        private String numeroSerie;


        public Moto(String marca, String cc, String numeroSerie) {
            this.marca = marca;
            this.cc = cc;
            this.numeroSerie = numeroSerie;
        }

        @Override
        public String getModelo() {
            return marca+" "+ cc;
        }

        @Override
        public String getFabricante() {
            return marca;
        }

        @Override
        public String getNome() {
            return marca;
        }

        @Override
        public String getId() {
            return numeroSerie;
        }
    }

    public static class Carro implements Motor,Veiculo{
        private String nome;
        private String motorizacao;
        private String opcionais;
        private String marca;
        private String chassi;

        public Carro(String nome, String motorizacao, String opcionais, String marca, String chassi) {
            this.nome = nome;
            this.motorizacao = motorizacao;
            this.opcionais = opcionais;
            this.marca = marca;
            this.chassi = chassi;
        }

        @Override
        public String getModelo() {
            return nome+" "+motorizacao+" "+opcionais;
        }

        @Override
        public String getFabricante() {
            return marca;
        }

        @Override
        public String getNome() {
            return nome;
        }

        @Override
        public String getId() {
            return chassi;
        }
    }

    public static void main(String[] args) {
        Carro carro = new Carro("UP", "1.0","TSI","VOLKS","767867867678");
        System.out.println(carro.getModelo());

        Moto moto = new Moto("Yamaha","100","89789237487238");
        System.out.println(moto.getModelo());

        Motor moto01 = new Moto("Yamaha","100","89789237487238");
        System.out.println(moto01.getNome());

    }
}
