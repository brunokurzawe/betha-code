public class OrientacaoWithArray {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Bruno";
        pessoa.altura = 1.77;
        pessoa.peso = 99.0;

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Julia";
        pessoa1.altura = 1.60;
        pessoa1.peso = 58.0;

        Pessoa[] pessoas = {pessoa, pessoa1};

        double somaPesos = 0;
        double media = 0;
        for (int i = 0; i < pessoas.length; i++) {
            somaPesos = somaPesos + pessoas[i].peso;
        }

        media = somaPesos / pessoas.length;
        System.out.println(media);
    }

    public static class Pessoa {
        String nome;
        Double altura;
        Double peso;

        public Double getImcDouble(){
            return peso / (altura * altura);
        }
    }
}
