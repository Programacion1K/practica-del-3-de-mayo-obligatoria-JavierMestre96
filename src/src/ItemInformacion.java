public class ItemInformacion{
    private String numeroTelefono;
    private String numeroTelefono2;
    private String direccion;

    ItemInformacion(String numero1, String numero2, String direccion){
        this.numeroTelefono=numero1;
        this.numeroTelefono2=numero2;
        this.direccion =direccion;
    }
    ItemInformacion(String numero , String direccion){
        this.numeroTelefono=numero;
        this.numeroTelefono2=null;
        this.direccion =direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getNumeroTelefono2() {
        return numeroTelefono2;
    }

    public void setNumeroTelefono2(String numeroTelefono2) {
        this.numeroTelefono2 = numeroTelefono2;
    }

    @Override
    public String toString() {
        return "ItemInformacion{" +
                "direccion='" + direccion + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", numeroTelefono2='" + numeroTelefono2 + '\'' +
                '}';
    }
}
