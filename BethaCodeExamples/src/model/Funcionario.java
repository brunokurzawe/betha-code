package model;

public class Funcionario extends Individuo{

    public Funcionario(String nome, Double altura, Double peso) {
        super(nome, altura, peso);
    }

    public void getImc(){
        double imc = getPeso() / (getAltura() * getAltura());
    }

    public void imprimeNomeFormatado(){
        System.out.println(getNomeFormatado());
    }
}
