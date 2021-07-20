

public class Cliente extends PessoaFisica{

    private Double limiteCredito;
    private Double limiteUtilizado;

    public Cliente(Integer id, String nome, String endereco, String telefone, String cpf, String rg, String sexo) {
        super(id, nome, endereco, telefone, cpf, rg, sexo);
        limiteCredito = 0.0;
        limiteUtilizado = 0.0;
    }

    public Double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(Double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public Double getLimiteUtilizado() {
        return limiteUtilizado;
    }

    public void setLimiteUtilizado(Double limiteUtilizado) {
        this.limiteUtilizado = limiteUtilizado;
    }

    public void aumentarLimiteEm(Double valorAumentar){
        this.limiteCredito = this.limiteCredito + valorAumentar;
        //this.limiteCredito += valorAumentar;
    }

    public void diminuirLimiteEm(Double valorDiminuir){
        this.limiteCredito = this.limiteCredito - valorDiminuir;
        //this.limiteCredito -= valorDiminuir;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome=" + getNome() +
                "limiteCredito=" + limiteCredito +
                ", limiteUtilizado=" + limiteUtilizado +
                '}';
    }
}
