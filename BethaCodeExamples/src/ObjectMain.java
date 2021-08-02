import java.util.Objects;

public class ObjectMain {

    public static class Pessoa extends Object{
        String nome;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pessoa pessoa = (Pessoa) o;
            return Objects.equals(nome, pessoa.nome);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome);
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome="bruno";

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome="bruno";

        if(pessoa.equals(pessoa2)){
            System.out.println("Iguais!!");
        }
    }
}
