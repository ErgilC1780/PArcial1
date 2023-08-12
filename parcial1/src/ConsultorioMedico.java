import java.util.*;

public class ConsultorioMedico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Medico> medicos = new HashMap<>();
        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("Juan", 20, "calle 2", "masculino"));
        pacientes.add(new Paciente("pedro", 20, "calle 1", "masculino"));
        pacientes.add(new Paciente("Maria", 25, "calle 2", "femenino"));

        while (true) {
            System.out.println("1. Agregar nuevo médico");
            System.out.println("2. Agregar nuevo paciente");
            System.out.println("3. Agendar consulta");
            System.out.println("4. Mostrar historial médico de paciente");
            System.out.println("5. Salir");
            System.out.print("Elije una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea después del número

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del médico: ");
                    String nombreMedico = scanner.nextLine();
                    System.out.print("Edad del médico: ");
                    int edadMedico = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea después del número
                    System.out.print("Dirección del médico: ");
                    String direccionMedico = scanner.nextLine();
                    System.out.print("Género del médico: ");
                    String generoMedico = scanner.nextLine();
                    System.out.print("Especialidad del médico: ");
                    String especialidadMedico = scanner.nextLine();
                    Medico medico = new Medico(nombreMedico, edadMedico, direccionMedico, generoMedico, especialidadMedico);
                    medicos.put(nombreMedico, medico);
                    break;

                case 2:
                    System.out.print("Nombre del paciente: ");
                    String nombrePaciente = scanner.nextLine();
                    System.out.print("Edad del paciente: ");
                    int edadPaciente = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea después del número
                    System.out.print("Dirección del paciente: ");
                    String direccionPaciente = scanner.nextLine();
                    System.out.print("Género del paciente: ");
                    String generoPaciente = scanner.nextLine();
                    Paciente paciente = new Paciente(nombrePaciente, edadPaciente, direccionPaciente, generoPaciente);
                    pacientes.add(paciente);
                    break;

                case 3:
                    System.out.print("Nombre del paciente: ");
                    String nombrePacienteConsulta = scanner.nextLine();
                    System.out.print("Nombre del médico: ");
                    String nombreMedicoConsulta = scanner.nextLine();
                    System.out.print("Descripción de la consulta: ");
                    String descripcionConsulta = scanner.nextLine();

                    Medico medicoConsulta = medicos.get(nombreMedicoConsulta);
                    if (medicoConsulta != null) {
                        Paciente pacienteConsulta = null;
                        for (Paciente p : pacientes) {
                            if (p.getNombre().equals(nombrePacienteConsulta)) {
                                pacienteConsulta = p;
                                break;
                            }
                        }

                        if (pacienteConsulta != null) {
                            String consulta = "Médico: " + medicoConsulta.getNombre() + " - " + descripcionConsulta;
                            pacienteConsulta.agregarConsulta(consulta);
                            System.out.println("Consulta agendada con éxito.");
                        } else {
                            System.out.println("Paciente no encontrado.");
                        }
                    } else {
                        System.out.println("Médico no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Nombre del paciente: ");
                    String nombrePacienteHistorial = scanner.nextLine();
                    Paciente pacienteHistorial = null;
                    for (Paciente p : pacientes) {
                        if (p.getNombre().equals(nombrePacienteHistorial)) {
                            pacienteHistorial = p;
                            break;
                        }
                    }

                    if (pacienteHistorial != null) {
                        pacienteHistorial.mostrarHistorialMedico();
                    } else {
                        System.out.println("Paciente no encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}

