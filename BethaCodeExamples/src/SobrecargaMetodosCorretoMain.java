public class SobrecargaMetodosCorretoMain {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setDadosPessoais("Bruno Kurzawe");
        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());

        Cliente cliente1 = new Cliente();
        cliente1.setDadosPessoais("Bruno Kurzawe","046556225121","Brasil");
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getPais());
        System.out.println(cliente1.getBairro());
    }

    public static class Cliente {
        private String nome;
        private String cpf;
        private String pais;
        private String cidade;
        private String bairro;
        private String rua;

        public Cliente() {

        }

        public void setDadosPessoais(String nome, String cpf, String pais, String cidade, String bairro, String rua) {
            if(nome.length()<2){
                System.out.println("");
            }
            setNome(nome);
            setCpf(cpf);
            setPais(pais);
            setCidade(cidade);
            setBairro(bairro);
            setRua(rua);
        }

        public void setDadosPessoais(String nome, String cpf, String pais, String cidade, String bairro) {
            setDadosPessoais(nome,cpf, pais, cidade, bairro, null);
        }

        public void setDadosPessoais(String nome, String cpf, String pais, String cidade) {
            setDadosPessoais(nome,cpf, pais, cidade, null);
        }

        public void setDadosPessoais(String nome, String cpf, String pais) {
            setDadosPessoais(nome,cpf, pais, null);
        }

        public void setDadosPessoais(String nome, String cpf) {
            setDadosPessoais(nome,cpf, null);
        }

        public void setDadosPessoais(String nome) {
            setDadosPessoais(nome,null);
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
