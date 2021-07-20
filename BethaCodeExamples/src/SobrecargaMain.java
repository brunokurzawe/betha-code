public class SobrecargaMain {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Bruno","454545664","Brasil","Criciuma","Centro", "Rua tal");
        System.out.println(cliente.getNome());

        Cliente cliente2 = new Cliente("Bruno","454545664");
        cliente2.setCidade("Criciuma");
        System.out.println(cliente2.getCidade());
    }


    public static class Cliente{
        private String nome;
        private String cpf;
        private String pais;
        private String cidade;
        private String bairro;
        private String rua;

        public Cliente(String nome, String cpf, String pais, String cidade, String bairro, String rua) {
            this.nome = nome;
            this.cpf = cpf;
            this.pais = pais;
            this.cidade = cidade;
            this.bairro = bairro;
            this.rua = rua;
        }

        public Cliente(String nome, String cpf, String pais, String cidade) {
            this.nome = nome;
            this.cpf = cpf;
            this.pais = pais;
            this.cidade = cidade;
        }

        public Cliente(String nome, String cpf, String pais) {
            this.nome = nome;
            this.cpf = cpf;
            this.pais = pais;
        }

        public Cliente(String nome, String cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getPais() {
            return pais;
        }

        public void setPais(String pais) {
            this.pais = pais;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getBairro() {
            return bairro;
        }

        public void setBairro(String bairro) {
            this.bairro = bairro;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }
    }
}
