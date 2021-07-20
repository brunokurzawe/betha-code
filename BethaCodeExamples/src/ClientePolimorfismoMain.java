public class ClientePolimorfismoMain {


    public static void main(String[] args) {
        Cliente cliente1 = ClienteBuilder.criaCliente("Premium");
        cliente1.setPercentualDesconto(25.0);
        System.out.println(cliente1.getPercentualDesconto());

        if (cliente1.getTipoCliente().equals("Premium")) {
            Double valorAdicional = ((ClientePremium) cliente1).getBonus();
            System.out.println("BONUS PREMIUM: " + (cliente1.getPercentualDesconto() + valorAdicional));
        }

    }

    public static class ClienteBuilder {
        public static Cliente criaCliente(String tipo) {
            if (tipo.equals("Premium")) {
                return new ClientePremium();
            } else if (tipo.equals("Master")) {
                return new ClienteMaster();
            } else if (tipo.equals("Vip")) {
                return new ClienteVip();
            } else {
                return new Cliente();
            }
        }

    }

    public static class Cliente {
        private Double percentualDesconto;
        private String tipoCliente;

        public Cliente() {
            setTipoCliente("Normal");
        }

        public Double getPercentualDesconto() {
            return percentualDesconto;
        }

        public void setPercentualDesconto(Double percentualDesconto) {
            this.percentualDesconto = percentualDesconto;
        }

        public String getTipoCliente() {
            return tipoCliente;
        }

        public void setTipoCliente(String tipoCliente) {
            this.tipoCliente = tipoCliente;
        }
    }

    public static class ClienteVip extends Cliente {

        public ClienteVip() {
            setTipoCliente("Vip");
        }

        @Override
        public Double getPercentualDesconto() {
            return super.getPercentualDesconto() + (super.getPercentualDesconto() * 0.5);
        }
    }

    public static class ClienteMaster extends Cliente {

        public ClienteMaster() {
            setTipoCliente("Master");
        }

        @Override
        public Double getPercentualDesconto() {
            return super.getPercentualDesconto() + (super.getPercentualDesconto() * 0.7);
        }
    }

    public static class ClientePremium extends Cliente {

        public ClientePremium() {
            setTipoCliente("Premium");
        }

        @Override
        public Double getPercentualDesconto() {
            return super.getPercentualDesconto() + (super.getPercentualDesconto() * 0.7);
        }

        public Double getBonus() {
            return 100.00;
        }
    }

}
