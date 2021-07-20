public class SobrecargaMetodosMain {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setDadosPessoais("Bruno Kurzawe", "046585545455");

        System.out.println(cliente.getNome());
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

        public void setDadosPessoais(String nome) {
            setNome(nome);
        }

        public void setDadosPessoais(String nome, String cpf) {
            if(nome.length()<2){
                System.out.println("");
            }
            setNome(nome);
            setCpf(cpf);
        }

        public void setDadosPessoais(String nome, String cpf, String pais) {
            if(nome.length()<2){
                System.out.println("");
            }
            setNome(nome);
            setCpf(cpf);
            setPais(pais);
        }

        public void setDadosPessoais(String nome, String cpf, String pais, String cidade) {
            if(nome.length()<2){
                System.out.println("");
            }
            setNome(nome);
            setCpf(cpf);
            setPais(pais);
            setCidade(cidade);
        }

        public void setDadosPessoais(String nome, String cpf, String pais, String cidade, String bairro) {
            if(nome.length()<2){
                System.out.println("");
            }
            setNome(nome);
            setCpf(cpf);
            setPais(pais);
            setCidade(cidade);
            setBairro(bairro);
        }

        public void setDadosPessoais(String nome, String cpf, String pais, String cidade, String bairro, String rua) {
            setNome(nome);
            setCpf(cpf);
            setPais(pais);
            setCidade(cidade);
            setBairro(bairro);
            setRua(rua);
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
