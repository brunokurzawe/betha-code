package parte3interface;

public class InterfaceMain {

    public static class Funcionario {
        public String login;
        public int senha;
    }

    public static class Diretor extends Funcionario implements Autenticavel {
        @Override
        public boolean autentica(int senha) {
            // Verificar aqui se a senha confere com a recebida como parâmetro.
            return true;
        }
    }

    public static class Gerente extends Funcionario implements Autenticavel {
        @Override
        public boolean autentica(int senha) {
            // Verificar aqui se a senha confere com a recebida como parâmetro.
            // No caso do gerente, conferir também se o departamento dele
            // tem acesso.
            return true;
        }
    }

    public class Cliente implements Autenticavel {
        public String login;
        public int senha;

        @Override
        public boolean autentica(int senha) {
            return true;
        }
    }

    public interface Autenticavel {
        boolean autentica(int senha);
    }

    public static class SistemaInterno {
        public void login(Autenticavel autenticavel) {
            autenticavel.autentica(123456);
            System.out.println("Logado!!");
        }
    }

    public static void main(String[] args) {
        Autenticavel diretor = new Diretor();
        Autenticavel gerente = new Gerente();

        SistemaInterno sis = new SistemaInterno();
        sis.login(diretor);
        sis.login(gerente);
    }
}

