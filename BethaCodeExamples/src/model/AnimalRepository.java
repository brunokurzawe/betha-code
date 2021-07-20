package model;

public class AnimalRepository {

    public void findAnimal() {
        Animal animal = new Animal("toto",0.47,20.1,"pitbull",true,"branco");

        animal.setPeso(40.00);

        animal.getPeso();

    }
}
