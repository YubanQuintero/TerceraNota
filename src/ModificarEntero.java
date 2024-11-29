public class ModificarEntero {
    public static void main(String[] args) {
        int numero = 10;

        System.out.println("Antes de llamar al método modificar: " + numero);

        int nuevoNumero = modificarEntero(numero);

        System.out.println("Después de llamar al método modificar:");
        System.out.println("Valor original: " + numero);
        System.out.println("Valor retornado: " + nuevoNumero);
    }

    public static int modificarEntero(int valor) {
        valor += 5; // Incrementa el valor en 5
        System.out.println("Dentro del método modificar: " + valor);
        return valor;
    }
}
