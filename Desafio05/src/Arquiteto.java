public class Arquiteto extends Funcionario {
    public Arquiteto(int id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public Arquiteto(int id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public Arquiteto(int id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto() {
        return super.getSalarioBruto() * 1.15;
    }
}
