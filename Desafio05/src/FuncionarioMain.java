public class FuncionarioMain {

    public static void main(String[] args) {

        Funcionario funcionario = FuncionarioBuilder.criaFuncionario("COORDENADOR", 1, "Alex", "04696909975", 1000.00);

        System.out.println("Salario Bruto: "+ funcionario.getSalarioBruto());

        Folha folhaJulho = new Folha(1, funcionario, "15/07/2021");

        folhaJulho.calcular();
        System.out.println("Salario Liquido::" + folhaJulho.getSalarioLiquido());


        Folha folhaAgosto = new Folha(2, funcionario, "15/08/2021");

        Desconto[] descontos = new Desconto[3];
        descontos[0] = new Desconto(1,"UNIMED",100.00);
        descontos[1] = new Desconto(2,"FARMACIA",250.00); //400,00
        descontos[2] = new Desconto(3,"SINDICADO",50.00);

        folhaAgosto.calcular(descontos);
        System.out.println("Salario Liquido::" + folhaAgosto.getSalarioLiquido());

        Folha folhaSetembro = new Folha(3, funcionario, "15/09/2021");

        Desconto[] descontosSetembro = new Desconto[3];
        descontosSetembro[0] = new Desconto(1,"UNIMED",100.00);
        descontosSetembro[1] = new Desconto(2,"FARMACIA",250.00); //400,00
        descontosSetembro[2] = new Desconto(3,"SINDICADO",50.00);

        folhaSetembro.calcular(descontosSetembro,1000.00);
        System.out.println("Salario Liquido::" + folhaSetembro.getSalarioLiquido());

    }


}
