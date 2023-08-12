import java.util.ArrayList;
import java.util.List;

public class Paciente extends Persona{
    private List<String> historialMedico;

    public Paciente(String nombre, int edad, String direccion, String genero) {
        super(nombre, edad, direccion, genero);
        this.historialMedico = new ArrayList<>();
    }

    public void agregarConsulta(String consulta) {
        historialMedico.add(consulta);
    }

    public void mostrarHistorialMedico() {
        System.out.println("Historial Médico de " + getNombre() + ":");
        for (String consulta : historialMedico) {
            System.out.println(consulta);
        }
    }

}
