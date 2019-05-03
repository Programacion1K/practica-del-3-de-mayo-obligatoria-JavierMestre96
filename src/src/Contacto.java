import java.util.Objects;

public class Contacto {
    private final String nombre;

    Contacto(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
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

}
