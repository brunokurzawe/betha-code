package model;

import java.util.Scanner;

public class CasaMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Informe o valor da posição 0:: ");
        int posicao0 = s.nextInt();
        numeros[0] = posicao0;

        System.out.println("Informe o valor da posição 1:: ");
        int posicao1 = s.nextInt();
        numeros[1] = posicao1;

    }

    public static class Casa {
        private String endereco;
        private Integer numeroQuartos;
        private Integer numeroBanheiros;
        private Double metragem;

        public Casa(String endereco, Integer numeroQuartos, Integer numeroBanheiros, Double metragem) {
            this.endereco = endereco;
            this.numeroQuartos = numeroQuartos;
            this.numeroBanheiros = numeroBanheiros;
            this.metragem = metragem;
        }

        public String getEndereco() {
            return endereco;
        }

        public Integer getNumeroQuartos() {
            return numeroQuartos;
        }

        public Integer getNumeroBanheiros() {
            return numeroBanheiros;
        }

        public Double getMetragem() {
            return metragem;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public void setNumeroQuartos(Integer numeroQuartos) {
            this.numeroQuartos = numeroQuartos;
        }

        public void setNumeroBanheiros(Integer numeroBanheiros) {
            this.numeroBanheiros = numeroBanheiros;
        }

        public void setMetragem(Double metragem) {
            this.metragem = metragem;
        }

        @Override
        public String toString() {
            return "Casa{" +
                    "endereco='" + endereco + '\'' +
                    ", numeroQuartos=" + numeroQuartos +
                    ", numeroBanheiros=" + numeroBanheiros +
                    ", metragem=" + metragem +
                    '}';
        }
    }
}
