import java.util.ArrayList;
import java.util.List;

public class ItemInformacion implements Comparable<ItemInformacion>{
    private String nombreItem;
    private String dato;

    public ItemInformacion(String nombreItem, String dato) {
        this.nombreItem = nombreItem;
        this.dato = dato;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String info(){
        String info="";
        info+=this.nombreItem+" : "+this.dato;
        return info;
    }

    @Override
    public String toString() {
        return nombreItem +" : " + dato;
    }


    public static void main(String[] args) {
        ItemInformacion info1 = new ItemInformacion("Cumpleaños","2 de Enero");
        System.out.println(info1);
    }

    @Override
    public int compareTo(ItemInformacion informacion) {
        return this.nombreItem.compareTo(informacion.nombreItem);
    }
}
