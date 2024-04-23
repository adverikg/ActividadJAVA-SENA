package ActividadJAVA;

public class Paciente {
    // Atributos
    private String nombre;
    private int edad;
    private String genero;
    private String enfermedad;

    // Constructor sin parámetros
    public Paciente() {
        this.nombre = "Juan Pérez";
        this.edad = 35;
        this.genero = "Masculino";
        this.enfermedad = "Hipertensión";
    }

    // Constructor con parámetros
    public Paciente(String nombre, int edad, String genero, String enfermedad) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.enfermedad = enfermedad;
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    // Método para mostrar información del paciente
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Enfermedad: " + enfermedad);
    }

    public static void main(String[] args) {
        // Crear un paciente usando el constructor sin parámetros
        Paciente paciente1 = new Paciente();
        System.out.println("Paciente 1:");
        paciente1.mostrarInformacion();

        System.out.println();

        // Crear un paciente usando el constructor con parámetros
        Paciente paciente2 = new Paciente("María López", 45, "Femenino", "Diabetes");
        System.out.println("Paciente 2:");
        paciente2.mostrarInformacion();
    }
}
