import java.sql.Date;

public class PagoTarjeta implements Pago {
    protected float monto;
    protected String numero;
    protected Date expira;
    protected String propietario;
    protected String banco;
    @Override
    public boolean realizarPago(float monto) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
