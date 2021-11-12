import java.util.ArrayList;

import java.util.Date;;
public class Receta {
    protected Doctor doctor;
    protected Date fecha;
    protected Paciente paciente;
    private ArrayList<PlanNutricional> planNut;
    private ArrayList<Medicamento> med;   

    public Receta(Doctor doctor, Date fecha, Paciente paciente, ArrayList<PlanNutricional> planNut, ArrayList<Medicamento> med) {
        this.doctor = doctor;
        this.fecha = fecha;
        this.paciente = paciente;
        this.planNut = planNut; 
        this.med = med;
    }
    
    
}
