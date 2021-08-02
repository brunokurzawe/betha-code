public class FuncionarioAbstractMain {

    public static abstract class Funcionario {
        String nome;
        Double salario;
        
        public Funcionario(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public abstract Double getBonificacao();

        public Double getSalario() {
            return salario;
        }

        public void setSalario(Double salario) {
            this.salario = salario;
        }
    }

    public static class Presidente extends Funcionario {

        public Presidente(String nome) {
            super(nome);
        }

        @Override
        public Double getBonificacao() {
            return getSalario() * 1.12;
        }
    }

    public abstract static class Secretaria extends Funcionario{

        public Secretaria(String nome) {
            super(nome);
        }
    }

    public static class SecretariaAgencia extends Secretaria{

        public SecretariaAgencia(String nome) {
            super(nome);
        }

        @Override
        public Double getBonificacao() {
            return getSalario()*1.30;
        }
    }

    public static class SecretariaAdministrativa extends Secretaria{

        public SecretariaAdministrativa(String nome) {
            super(nome);
        }

        @Override
        public Double getBonificacao() {
            return getSalario() * 1.40;
        }
    }

    public static class Gerente extends Funcionario {

        public Gerente(String nome) {
            super(nome);
        }

        @Override
        public Double getBonificacao() {
            return getSalario() * 1.15;
        }
    }

    public static class Diretor extends Gerente {

        public Diretor(String nome) {
            super(nome);
        }

    }

    public static void main(String[] args) {
        Funcionario funcionario = new Gerente("Bruno");
        funcionario.setSalario(1500.00);
        System.out.println(funcionario.getBonificacao());
    }

}
