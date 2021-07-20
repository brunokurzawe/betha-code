package model;

public class Animal {

    private String nome;
    private Double altura;
    private Double peso;
    private String raca;
    private Boolean mamifero;
    private String cor;

    public Animal(String nome, Double altura, Double peso, String raca, Boolean mamifero, String cor) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.raca = raca;
        this.mamifero = mamifero;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getPeso() {
        return peso;
    }

    public String getRaca() {
        return raca;
    }

    public Boolean getMamifero() {
        return mamifero;
    }

    public String getCor() {
        return cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setMamifero(Boolean mamifero) {
        this.mamifero = mamifero;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
