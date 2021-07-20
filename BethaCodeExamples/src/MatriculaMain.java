public class MatriculaMain {

    public static void main(String[] args) {
        Matricula matricula = MatriculaBuilder.criaMatricula("FUNCIONARIO");
        matricula.setSalario(1000.00);
        System.out.println(matricula.getSalario());

        Matricula matricula2 = MatriculaBuilder.criaMatricula("ESTAGIARIO");
        matricula2.setSalario(1000.00);
        System.out.println(matricula2.getSalario());
    }

    public static class MatriculaBuilder {
        public static Matricula criaMatricula(String tipo){
            if (tipo.equals("FUNCIONARIO")){
                return new Funcionario();
            }
            return new Estagiario();
        }
    }

    public static class Matricula {
        private Double salario;

        public Double getSalario() {
            return salario;
        }

        public void setSalario(Double salario) {
            this.salario = salario;
        }
    }

    public static class Funcionario extends Matricula {

        @Override
        public Double getSalario() {
            return super.getSalario() + (super.getSalario() * 0.20);
        }
    }

    public static class Estagiario extends Matricula {

        @Override
        public Double getSalario() {
            return super.getSalario() + (super.getSalario() * 0.10);
        }
    }


}
