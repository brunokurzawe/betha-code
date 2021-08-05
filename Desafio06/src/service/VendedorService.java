package service;

public class VendedorService implements Persistivel{


    public void geraAuditoria(){

    }

    @Override
    public void save() {
        this.geraAuditoria();
        System.out.println("Salvando");
    }

    @Override
    public void update() {
        System.out.println("Atualizando");
    }

    @Override
    public void remove() {
        System.out.println("Removendo");
    }
}
