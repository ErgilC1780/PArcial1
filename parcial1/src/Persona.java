public class Persona {
    private String nombre;
    private int edad;
    private String direccion;
    private String genero;

    public Persona(String nombre, int edad, String direccion, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.genero = genero;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getGenero() {
        return genero;
    }

    public String toString() {
        return "Nombre: " + nombre + "\nEdad: " + edad + "\nDirección: " + direccion + "\nGénero: " + genero;
    }

}
