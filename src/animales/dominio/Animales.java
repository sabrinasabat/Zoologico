package animales.dominio;

public class Animales {

    private final String nombre;

    public Animales(String nombre){
        this.nombre = nombre;
    }

    public void comer(){
        System.out.println("El animal está comiendo...");
    }

    public void dormir(){
        System.out.println("El animal está durmiendo...");
    }

}
