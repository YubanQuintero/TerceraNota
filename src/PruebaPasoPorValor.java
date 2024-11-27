public class PruebaPasoPorValor {
    public static void main(String[] args) {
        int numero = 10;
        System.out.println("Valor antes de llamar al método: " + numero);
        cambiarValor(numero);
        System.out.println("Valor después de llamar al método: " + numero);
    }

    public static void cambiarValor(int valor) {
        valor = 20; // Se cambia el valor dentro del método
        System.out.println("Valor dentro del método: " + valor);
    }
}
