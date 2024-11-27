class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
}

public class PruebaPasoPorReferencia1 {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
        System.out.println("Nombre antes de llamar al método: " + persona.nombre);

        modificarPersona(persona);

        System.out.println("Nombre después de llamar al método: " + persona.nombre);
    }

    public static void modificarPersona(Persona persona) {
        persona.cambiarNombre("María");
        System.out.println("Nombre dentro del método: " + persona.nombre);
    }
}
