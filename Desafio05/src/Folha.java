public class Folha {

    private int id;
    private Funcionario funcionario;
    private String data;
    private Desconto[] descontos;
    private Double salarioLiquido;

    public Folha(int id, Funcionario funcionario, String data) {
        this.id = id;
        this.funcionario = funcionario;
        this.data = data;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public String getData() {
        return data;
    }

    public Desconto[] getDescontos() {
        return descontos;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void calcular() {
        this.calcular(null);
    }

    public void calcular(Desconto[] descontos) {
        this.calcular(descontos, null);
    }

    public void calcular(Desconto[] descontos, Double bonus) {
        Double salarioBruto = funcionario.getSalarioBruto();
        Double salarioLiquido = salarioBruto;

        salarioLiquido -= getDescontoIRPF(salarioBruto);
        salarioLiquido -= getDescontoINSS(salarioBruto);

        if (descontos != null) {
            for (int i = 0; i < descontos.length; i++) {
                salarioLiquido -= descontos[i].getValor();
            }
        }

        if(bonus != null){
            salarioLiquido += bonus;
        }

        this.salarioLiquido = salarioLiquido;
    }


    public Double getDescontoIRPF(Double salarioBruto) {
        Double desconto = 0.0;
        Double descontoPercentual = 0.0;

        if (salarioBruto <= 1903.98) {
            descontoPercentual = 0.0;
        } else if (salarioBruto <= 2826.65) {
            descontoPercentual = 7.5;
        } else if (salarioBruto <= 3751.05) {
            descontoPercentual = 15.0;
        } else if (salarioBruto <= 4664.68) {
            descontoPercentual = 22.5;
        } else {
            descontoPercentual = 27.5;
        }

        desconto = (salarioBruto * (descontoPercentual / 100));

        System.out.println("Desconto IRPF: R$" + desconto);

        return desconto;
    }

    public Double getDescontoINSS(Double salarioBruto) {
        Double desconto = 0.0;

        if (salarioBruto > 1100.0) {
            desconto += (1100.0 * 0.075);
            salarioBruto -= 1100.0;

            if (salarioBruto > 2203.48) {
                desconto += (2203.48 * 0.09);
                salarioBruto -= 2203.48;

                if (salarioBruto > 3305.22) {
                    desconto += (3305.22 * 0.12);
                    salarioBruto -= 3305.22;

                    if (salarioBruto > 6433.57) {
                        desconto += (6433.57 * 0.14);
                    } else {
                        desconto += (salarioBruto * 0.14);
                    }
                } else {
                    desconto += (salarioBruto * 0.12);
                }
            } else {
                desconto += (salarioBruto * 0.09);
            }
        } else {
            desconto += (salarioBruto * 0.075);
        }

        System.out.println("Desconto INSS: R$" + desconto);

        return desconto;
    }

}
