import java.util.ArrayList;
import java.util.Date;

public class Paciente extends Persona{
    protected String email;
    private ArrayList<Cita> cita;
    private ArrayList<HistoriaClinica> historiaC;
    private ArrayList<Receta> receta;

    public Paciente(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
        historiaC= new ArrayList<HistoriaClinica>(); // Solo se define cuando se crea un paciente dado que esta en una relacion de composicion
        cita= new ArrayList<Cita>();
    }
    
    public boolean solicitarCita(){
        return false;
    }
}

