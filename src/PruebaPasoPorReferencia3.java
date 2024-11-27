class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}

public class PruebaPasoPorReferencia3 {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
        System.out.println("Nombre antes de llamar al método: " + persona.nombre);

        reasignarReferencia(persona);

        System.out.println("Nombre después de llamar al método: " + persona.nombre);
    }

    public static void reasignarReferencia(Persona persona) {
        persona = new Persona("María"); // Se crea un nuevo objeto y se reasigna la referencia
        System.out.println("Nombre dentro del método (nueva referencia): " + persona.nombre);
    }
}
