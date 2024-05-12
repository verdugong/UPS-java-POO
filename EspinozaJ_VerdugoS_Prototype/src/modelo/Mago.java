package modelo;

public class Mago extends Personaje{
    private String encanto;

    public Mago(String encanto, String nombre, String habilidad, String equipo) {
        super(nombre, habilidad, equipo);
        this.imagen="/imagenes/mago1.png";
        this.encanto = encanto;
    }
    
    @Override
    public CloneablePersonaje clonar() {
        Mago magoClon = new Mago(encanto, nombre, habilidad, equipo);
        magoClon.setImagen(imagen); 
        magoClon.setEncanto(encanto);
        magoClon.setNombre(nombre);
        magoClon.setHabilidad(habilidad);
        magoClon.setEquipo(equipo); 
        return magoClon;
    }

    public String getEncanto() {
        return encanto;
    }

    public void setEncanto(String encanto) {
        this.encanto = encanto;
    }
}
