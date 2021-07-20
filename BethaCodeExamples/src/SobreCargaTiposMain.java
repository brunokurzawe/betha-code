public class SobreCargaTiposMain {

    public static void main(String[] args) {
        Maquina maquina = new Maquina();

        maquina.configuraPrecisao("0.3");
        System.out.println(maquina.getPrecisao());

        maquina.configuraPrecisao(0.9);
        System.out.println(maquina.getPrecisao());

        maquina.configuraPrecisao(1);
        System.out.println(maquina.getPrecisao());
    }

    public static class Maquina {

        private Double precisao;

        public Double getPrecisao() {
            return precisao;
        }

        public void configuraPrecisao(String precisao) {
            this.precisao = Double.valueOf(precisao);
        }

        public void configuraPrecisao(Integer precisao) {
            this.precisao = Double.parseDouble(precisao.toString());
        }

        public void configuraPrecisao(Double precisao) {
            this.precisao = precisao;
        }

    }
}
