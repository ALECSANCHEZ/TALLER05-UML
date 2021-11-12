import java.util.*;

public class Cita implements Pago{
    protected Date fecha;
    protected boolean pagada;
    protected String registradoPor;
    private Paciente paciente;


    @Override
    public boolean realizarPago(float monto) {
        return false;
    }
}
