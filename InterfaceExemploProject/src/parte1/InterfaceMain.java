package parte1;

public class InterfaceMain {

    public class Funcionario {
        public String login;
        public int senha;
    }

    public class Diretor extends Funcionario {
        public boolean autentica(int senha) {
            // Verificar aqui se a senha confere com a recebida como parâmetro.
            return true;
        }
    }

    public class Gerente extends Funcionario {
        public boolean autentica(int senha) {
            // Verificar aqui se a senha confere com a recebida como parâmetro.
            // No caso do gerente, conferir também se o departamento dele
            // tem acesso.
            return true;
        }
    }

//    public class SistemaInterno{
//        public void login(Funcionario funcionario){
//            funcionario.autentica(123456);
//        }
//    }


    public class SistemaInterno {
        public void login(Diretor funcionario) {
            funcionario.autentica(123456);
        }

        public void login(Gerente funcionario) {
            funcionario.autentica(123456);
        }
    }
}
