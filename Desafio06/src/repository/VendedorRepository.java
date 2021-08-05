package repository;

public class VendedorRepository implements Buscavel{

    @Override
    public void findById(Long id) {
        ///elastic
        System.out.println("Listando por id!");
    }

    @Override
    public void findAll() {
        System.out.println("Listando!");
    }
}
