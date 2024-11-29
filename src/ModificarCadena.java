public class ModificarCadena {
    public static void main(String[] args) {
        String texto = "Hola";

        System.out.println("Antes de llamar al método modificar: " + texto);

        modificarCadena(texto);

        System.out.println("Después de llamar al método modificar: " + texto);
    }

    public static void modificarCadena(String cadena) {
        cadena = cadena + " Mundo"; // Se intenta modificar la cadena
        System.out.println("Dentro del método modificar: " + cadena);
    }
}
