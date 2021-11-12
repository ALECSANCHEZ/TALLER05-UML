import java.util.ArrayList;
import java.util.Date;

public class Doctor extends Persona{
    protected Secretaria secretaria;
    protected int regDoctor;
    protected String especialidad;
    private ArrayList<Receta> recetas;
    protected ArrayList<AreaMedica> areas;

    public Doctor(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
    }
    
    public void recetar() {

    }

    public void agregarPlanNut() {
    }

    public void imprimirReceta() {
    }

    public void registrarSecretaria() {
    }

}
