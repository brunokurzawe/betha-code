public class AnimalMain {

    public static class Animal{
        private String nome;
        private String raca;
        private String som;
        private Integer qtePatas;

        public Animal(String nome, String raca, String som, Integer qtePatas) {
            this.nome = nome;
            this.raca = raca;
            this.som = som;
            this.qtePatas = qtePatas;
        }

        public Animal(String nome, String raca, String som) {
            new Animal(nome, raca, som, null);
        }

        public Animal(String nome, String raca) {
            new Animal(nome, raca, null, null);
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getRaca() {
            return raca;
        }

        public void setRaca(String raca) {
            this.raca = raca;
        }

        public String getSom() {
            return som;
        }

        public String getSom(String somAMais) {
            return getSom() +" e "+ somAMais;
        }

        public void setSom(String som) {
            this.som = som;
        }

        public Integer getQtePatas() {
            return qtePatas;
        }

        public void setQtePatas(Integer qtePatas) {
            this.qtePatas = qtePatas;
        }
    }

    public static class Gato extends Animal{

        public Gato(String nome, String raca, String som, Integer qtePatas) {
            super(nome, raca, som, qtePatas);
        }

        @Override
        public String getSom() {
            return "O Gato faz "+ super.getSom();
        }
    }

    public static class Cachorro extends Animal{

        public Cachorro(String nome, String raca, String som, Integer qtePatas) {
            super(nome, raca, som, qtePatas);
        }

        @Override
        public String getSom() {
            return "O Cachorro faz "+ super.getSom();
        }
    }

    public static class Jacare extends Animal{

        public Jacare(String nome, String raca, String som, Integer qtePatas) {
            super(nome, raca, som, qtePatas);
        }

        @Override
        public String getSom() {
            return "O Jacare faz "+ super.getSom();
        }
    }

    public static class AnimalBuilder{
        public static Animal criaAnimal(String tipo, String nome, String raca,String som, Integer qtdPatas){

                if (tipo.equals("CACHORRO")) {
                    return new Cachorro(nome, raca, som, qtdPatas);
                } else if (tipo.equals("GATO")) {
                    return new Gato(nome, raca, som, qtdPatas);
                }
                return new Jacare(nome, raca, som, qtdPatas);
        }
    }

    public static void main(String[] args) {
        Animal animal = AnimalBuilder.criaAnimal("CACHORRO","TOTO","GUAIPECA","AUA AUA",4);

        System.out.println(animal.getSom());
        System.out.println(animal.getSom("MIAU"));
    }

}
