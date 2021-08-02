public class AstractProject {

    public abstract static class Pessoa {
        private String nome;
        private String tipo;

        public Pessoa(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    }

    public class PessoaFisica extends Pessoa {
        private String cpf;

        public PessoaFisica(String nome) {
            super(nome);
            setTipo("PessoaFisica");
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
    }

    public class PessoaJuridica extends Pessoa {

        private String cnpj;

        public PessoaJuridica(String nome) {
            super(nome);
            setTipo("PessoaJuridica");
        }

        public String getCnpj() {
            return cnpj;
        }

        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }
    }

    public static void main(String[] args) {
        //Pessoa pessoa = new Pessoa("nome");
        //pessoa.getTipo();
    }
}
