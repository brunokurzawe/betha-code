public class PessoaFisica extends Pessoa{

    private String cpf;
    private String rg;
    private String sexo;
    private Double percentualDesconto; //10%

    public PessoaFisica(Integer id, String nome, String endereco, String telefone, String cpf, String rg, String sexo) {
        super(id, nome, endereco, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String getDocumentoPrincipal(){
        return getCpf();
    }

    public Double getPercentualDesconto() {
        return percentualDesconto;
    }
}
