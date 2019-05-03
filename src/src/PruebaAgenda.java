public class PruebaAgenda {
    public static void main(String[] args) {
        Contacto ana = new Contacto("Ana");
        Contacto bea = new Contacto("Bea");
        Contacto clara = new Contacto("Clara");
        ItemInformacion telefonoAna = new ItemInformacion("Teléfono","999999999");
        ItemInformacion direccionAna = new ItemInformacion("Dirección","C/ Mayor, 8");
        ItemInformacion telefonoBea = new ItemInformacion("Teléfono","999999999");
        ItemInformacion libroBea = new ItemInformacion("Libro favorito","El quijote");
        ItemInformacion comidaClara = new ItemInformacion("Comida favorita","Sushi");

        Agenda agenda = new Agenda("Agenda");

        agenda.anyadirContacto(ana);
        agenda.anyadirContacto(bea);
        agenda.anyadirContacto(clara);
        agenda.anyadirItem(ana,telefonoAna);
        agenda.anyadirItem(ana,direccionAna);
        agenda.anyadirItem(bea,telefonoBea);
        agenda.anyadirItem(bea,libroBea);
        agenda.anyadirItem(clara,comidaClara);

        System.out.println(agenda.listado());

        String info="";
        for (Contacto c:agenda.listaContacto()) {
            info+=c.info()+": ";
            for (ItemInformacion i:agenda.informacionContacto(c)) {
                info+=i.info();
            }
            info+="\n";
        }
        System.out.println(info);

    }
}
