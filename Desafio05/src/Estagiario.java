public class Estagiario extends Funcionario{

    public Estagiario(int id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public Estagiario(int id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public Estagiario(int id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto() * 1.05;
    }
}
