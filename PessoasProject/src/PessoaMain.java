public class PessoaMain {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(1,"Bruno","rua tal","999089410","515115","544564","M");

        System.out.println(cliente.getLimiteCredito());
        cliente.aumentarLimiteEm(10.0);

        cliente.aumentarLimiteEm(30.0);

        cliente.diminuirLimiteEm(5.0);
        System.out.println(cliente.getLimiteCredito());

        System.out.println(cliente.getDocumentoPrincipal());

        System.out.println(cliente);

    }

}
