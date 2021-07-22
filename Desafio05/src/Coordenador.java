public class Coordenador extends Funcionario {
    public Coordenador(int id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public Coordenador(int id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public Coordenador(int id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto() * 1.20;
    }
}
