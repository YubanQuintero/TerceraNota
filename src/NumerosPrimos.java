public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("Números primos entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Método para determinar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si es divisible por cualquier número distinto de 1 y sí mismo
            }
        }
        return true; // Si no se encontró divisor, es primo
    }
}
