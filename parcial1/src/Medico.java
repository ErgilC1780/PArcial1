public class Medico extends Persona{
    private String especialidad;

    public Medico(String nombre, int edad, String direccion, String genero, String especialidad) {
        super(nombre, edad, direccion, genero);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String toString() {
        return super.toString() + "\nEspecialidad: " + especialidad;
    }

}
