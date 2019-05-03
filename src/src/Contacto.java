import java.util.Objects;

public class Contacto implements Comparable<Contacto>{
    private final String nombre;

    Contacto(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String info(){
        return this.nombre.toUpperCase();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString(){
        return this.nombre;
    }

    public static void main(String[] args) {
        Contacto javier = new Contacto("Javier");
        Contacto ruben = new Contacto("Ruben");
        Contacto jorge = new Contacto("Jorge");

        System.out.println(javier);
        System.out.println(ruben);
        System.out.println(jorge);

    }

    @Override
    public int compareTo(Contacto contacto) {
        return this.nombre.compareTo(contacto.nombre);
    }
}
