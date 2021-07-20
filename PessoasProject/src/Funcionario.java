public class Funcionario extends PessoaFisica{

    private Double salarioBruto;
    private Double salarioLiquido;

    public Funcionario(Integer id, String nome, String endereco, String telefone, String cpf, String rg, String sexo) {
        super(id, nome, endereco, telefone, cpf, rg, sexo);
        salarioBruto = 0.0;
        salarioLiquido = 0.0;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getGetSalarioLiquido() {
        return salarioLiquido;
    }

    public void setGetSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public void aplicarDissidio(Double valorDissidio){
        this.salarioBruto += valorDissidio;
        //this.salarioBruto = this.salarioBruto + valorDissidio;
    }

    @Override
    public Double getPercentualDesconto() {
        //return super.getPercentualDesconto() + 15;
        return 20.0;
    }
}
