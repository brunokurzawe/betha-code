public class Analista extends Funcionario{
    public Analista(int id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public Analista(int id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public Analista(int id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto() * 1.10;
    }
}
