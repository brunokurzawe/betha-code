package parte2heranca;

public class InterfaceMain {

    public class Funcionario {
        public String login;
        public int senha;
    }

    public class FuncionarioAutenticavel extends Funcionario {

        public boolean autentica(int senha) {
            // Faz autenticação padrão.
            return true;
        }
    }

    public class Diretor extends FuncionarioAutenticavel {
        @Override
        public boolean autentica(int senha) {
            // Verificar aqui se a senha confere com a recebida como parâmetro.
            return true;
        }
    }

    public class Gerente extends FuncionarioAutenticavel {
        @Override
        public boolean autentica(int senha) {
            // Verificar aqui se a senha confere com a recebida como parâmetro.
            // No caso do gerente, conferir também se o departamento dele
            // tem acesso.
            return true;
        }
    }

    public class Cliente extends FuncionarioAutenticavel {
        public String login;
        public int senha;

        @Override
        public boolean autentica(int senha) {
            return true;
        }
    }

    public class SistemaInterno {
        public void login(FuncionarioAutenticavel funcionario) {
            funcionario.autentica(123456);
        }
    }
}
